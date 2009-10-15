package br.com.jfrootmaster.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateSupport {

	private EntityManagerFactory emf;

    private ThreadLocal<EntityManager> managerThread;
    private ThreadLocal<EntityTransaction> transactionThread;

    public HibernateSupport() {
        emf = Persistence.createEntityManagerFactory("chicken");
        managerThread = new ThreadLocal<EntityManager>();
        transactionThread = new ThreadLocal<EntityTransaction>();
    }

    public EntityManager getEntityManager() {
        if (managerThread.get() == null) {
            EntityManager em = emf.createEntityManager();
            managerThread.set(em);
        }
        return managerThread.get();
    }

    public EntityTransaction getEntityTransaction() {
        if (transactionThread.get() == null) {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transactionThread.set(transaction);
        }
        return transactionThread.get();
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
        getEntityManager().close();

        transactionThread.remove();
        managerThread.remove();
    }
}
