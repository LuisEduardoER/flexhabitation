package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadStatusTrack;

public class CadStatusTrackDAO extends BaseDao<Object> {

	public static CadStatusTrackDAO instance;

	public static CadStatusTrackDAO getInstance() {
		try {
			if (null == instance) instance = new CadStatusTrackDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadStatusTrack obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadStatusTrack obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadStatusTrack obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadStatusTrack load(String key) {
		
		CadStatusTrack obj;
		obj =  getEntityManager().find(CadStatusTrack.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadStatusTrack> listAll() {
		
		List<CadStatusTrack> lista = new ArrayList<CadStatusTrack>();

		String hql = null;
		hql = "from CadStatusTrack";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

