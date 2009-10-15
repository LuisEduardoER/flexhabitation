package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadPrioridade;

public class CadPrioridadeDAO extends BaseDao<Object> {

	public static CadPrioridadeDAO instance;

	public static CadPrioridadeDAO getInstance() {
		try {
			if (null == instance) instance = new CadPrioridadeDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadPrioridade obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadPrioridade obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadPrioridade obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadPrioridade load(String key) {
		
		CadPrioridade obj;
		obj =  getEntityManager().find(CadPrioridade.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadPrioridade> listAll() {
		
		List<CadPrioridade> lista = new ArrayList<CadPrioridade>();

		String hql = null;
		hql = "from CadPrioridade";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

