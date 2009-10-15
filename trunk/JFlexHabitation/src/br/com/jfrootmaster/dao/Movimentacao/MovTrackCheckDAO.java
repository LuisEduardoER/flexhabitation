package br.com.jfrootmaster.dao.Movimentacao;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Movimentacao.MovTrackCheck;

public class MovTrackCheckDAO extends BaseDao<Object> {

	public static MovTrackCheckDAO instance;

	public static MovTrackCheckDAO getInstance() {
		try {
			if (null == instance) instance = new MovTrackCheckDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(MovTrackCheck obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(MovTrackCheck obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(MovTrackCheck obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public MovTrackCheck load(String key) {
		
		MovTrackCheck obj;
		obj =  getEntityManager().find(MovTrackCheck.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<MovTrackCheck> listAll() {
		
		List<MovTrackCheck> lista = new ArrayList<MovTrackCheck>();

		String hql = null;
		hql = "from MovTrackCheck";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

