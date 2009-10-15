package br.com.jfrootmaster.dao.Movimentacao;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Movimentacao.HistoricoAtendente;

public class HistoricoAtendenteDAO extends BaseDao<Object> {

	public static HistoricoAtendenteDAO instance;

	public static HistoricoAtendenteDAO getInstance() {
		try {
			if (null == instance) instance = new HistoricoAtendenteDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(HistoricoAtendente obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(HistoricoAtendente obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(HistoricoAtendente obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public HistoricoAtendente load(String key) {
		
		HistoricoAtendente obj;
		obj =  getEntityManager().find(HistoricoAtendente.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<HistoricoAtendente> listAll() {
		
		List<HistoricoAtendente> lista = new ArrayList<HistoricoAtendente>();

		String hql = null;
		hql = "from HistoricoAtendente";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

