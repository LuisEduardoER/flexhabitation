package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadMensagemChave;

public class CadMensagemChaveDAO extends BaseDao<Object> {

	public static CadMensagemChaveDAO instance;

	public static CadMensagemChaveDAO getInstance() {
		try {
			if (null == instance) instance = new CadMensagemChaveDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadMensagemChave obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadMensagemChave obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadMensagemChave obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadMensagemChave load(String key) {
		
		CadMensagemChave obj;
		obj =  getEntityManager().find(CadMensagemChave.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadMensagemChave> listAll() {
		
		List<CadMensagemChave> lista = new ArrayList<CadMensagemChave>();

		String hql = null;
		hql = "from CadMensagemChave";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

