package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadCep;

public class CadCepDAO extends BaseDao<Object> {

	public static CadCepDAO instance;

	public static CadCepDAO getInstance() {
		try {
			if (null == instance) instance = new CadCepDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadCep obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadCep obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadCep obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadCep load(String key) {
		
		CadCep obj;
		obj =  getEntityManager().find(CadCep.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadCep> listAll() {
		
		List<CadCep> lista = new ArrayList<CadCep>();

		String hql = null;
		hql = "from CadCep";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<CadCep> listarPorCep(String cep) {
		
		List<CadCep> lista = new ArrayList<CadCep>();

		String hql = null;
		hql = "from CadCep where cep = :cep";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		query.setParameter("cep",cep);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

