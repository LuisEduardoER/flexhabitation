package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadCargo;

public class CadCargoDAO extends BaseDao<Object> {

	public static CadCargoDAO instance;

	public static CadCargoDAO getInstance() {
		try {
			if (null == instance) instance = new CadCargoDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadCargo obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadCargo obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadCargo obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadCargo load(String key) {
		
		CadCargo obj;
		obj =  getEntityManager().find(CadCargo.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadCargo> listAll() {
		
		List<CadCargo> lista = new ArrayList<CadCargo>();

		String hql = null;
		hql = "from CadCargo";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

