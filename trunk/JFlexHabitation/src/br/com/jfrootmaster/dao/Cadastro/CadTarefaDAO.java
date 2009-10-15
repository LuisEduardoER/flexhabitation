package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadTarefa;

public class CadTarefaDAO extends BaseDao<Object> {

	public static CadTarefaDAO instance;

	public static CadTarefaDAO getInstance() {
		try {
			if (null == instance) instance = new CadTarefaDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadTarefa obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadTarefa obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadTarefa obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadTarefa load(String key) {
		
		CadTarefa obj;
		obj =  getEntityManager().find(CadTarefa.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadTarefa> listAll() {
		
		List<CadTarefa> lista = new ArrayList<CadTarefa>();

		String hql = null;
		hql = "from CadTarefa";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

