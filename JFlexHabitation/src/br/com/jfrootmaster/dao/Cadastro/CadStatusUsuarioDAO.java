package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadStatusUsuario;

public class CadStatusUsuarioDAO extends BaseDao<Object> {

	public static CadStatusUsuarioDAO instance;

	public static CadStatusUsuarioDAO getInstance() {
		try {
			if (null == instance) instance = new CadStatusUsuarioDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadStatusUsuario obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadStatusUsuario obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadStatusUsuario obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadStatusUsuario load(String key) {
		
		CadStatusUsuario obj;
		obj =  getEntityManager().find(CadStatusUsuario.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadStatusUsuario> listAll() {
		
		List<CadStatusUsuario> lista = new ArrayList<CadStatusUsuario>();

		String hql = null;
		hql = "from CadStatusUsuario";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

