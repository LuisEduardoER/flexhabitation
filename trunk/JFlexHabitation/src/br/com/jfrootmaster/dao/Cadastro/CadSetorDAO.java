package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadSetor;

public class CadSetorDAO extends BaseDao<Object> {

	public static CadSetorDAO instance;

	public static CadSetorDAO getInstance() {
		try {
			if (null == instance) instance = new CadSetorDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadSetor obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadSetor obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadSetor obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadSetor load(String key) {
		
		CadSetor obj;
		obj =  getEntityManager().find(CadSetor.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadSetor> listAll() {
		
		List<CadSetor> lista = new ArrayList<CadSetor>();

		String hql = null;
		hql = "from CadSetor";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

