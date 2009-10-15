package br.com.jfrootmaster.dao;

import java.net.URL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.apache.log4j.Logger;



public class BaseDao<T> {
	private static EntityManagerFactory emf;

    private ThreadLocal<EntityManager> managerThread;
    private ThreadLocal<EntityTransaction> transactionThread;

	Logger logger;
	public BaseDao() {
		try { 
			emf = PersistenceUtil.loadInstance();
	        managerThread = new ThreadLocal<EntityManager>();
	        transactionThread = new ThreadLocal<EntityTransaction>();
	
			URL url = emf.getClass().getClassLoader().getResource("log4j.properties");
			org.apache.log4j.PropertyConfigurator.configure(url);
			logger = Logger.getLogger("ChickenLogger");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    public EntityTransaction getEntityTransaction() {
        if (transactionThread.get() == null) {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transactionThread.set(transaction);
        }
        return transactionThread.get();
    }

    public EntityManager getEntityManager() {
        if (managerThread.get() == null) {
            EntityManager em = PersistenceUtil.currentEntityManager();
            
            managerThread.set(em);
        }
        return managerThread.get();
    }

    public void startHibernateOperation() {
        getEntityTransaction().begin();
    }

    public void stopHibernateOperation(boolean commitChanges) {
        if (commitChanges) {
            getEntityTransaction().commit();
        } else {
            getEntityTransaction().rollback();
        }

        transactionThread.remove();
        managerThread.remove();
    }

	public void create(T obj) {
		getEntityManager().clear();
		startHibernateOperation();
		
		try {
			logger.info("Inserindo registro...");
			getEntityManager().persist(obj);
			stopHibernateOperation(true);
		} catch (Exception e) {
			e.printStackTrace();
			stopHibernateOperation(false);
			
			if(getEntityTransaction().isActive()) {
				stopHibernateOperation(false);
			}
			
	
		}
	}
	
	@SuppressWarnings("finally")
	public void delete(T obj) {
		getEntityManager().clear();
		startHibernateOperation();
		
		try {
			logger.info("Deletando registro...");
			getEntityManager().remove(getEntityManager().merge(obj));
			
			stopHibernateOperation(true);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exclusão do registro não foi efetuada", e);
			
			if(getEntityTransaction().isActive()) {
				stopHibernateOperation(false);
			}

	
		}
	}

	public T update(T obj) {
         
		startHibernateOperation();
		try {
			logger.info("Alterando registro...");
			obj = getEntityManager().merge(obj);
			stopHibernateOperation(true);

		} catch (Exception e) {
			e.printStackTrace();
			stopHibernateOperation(false);

			if(getEntityTransaction().isActive()) {
				stopHibernateOperation(false);
			}
			

		}
		
		return obj;
	}
	
}
