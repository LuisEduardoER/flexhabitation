package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadUsuario;

public class CadUsuarioDAO extends BaseDao<Object> {

	public static CadUsuarioDAO instance;

	public static CadUsuarioDAO getInstance() {
		try {
			if (null == instance) instance = new CadUsuarioDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadUsuario obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadUsuario obj) {
		
		super.update(obj);
		
	}
	
	@SuppressWarnings("unchecked")
	public void delete(Integer key)  {

		super.delete(load(key));
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(Integer.parseInt(key)));
		
	}
	
	@SuppressWarnings("unchecked")
	public CadUsuario load(Integer key) {
		
		CadUsuario obj;
		obj =  getEntityManager().find(CadUsuario.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadUsuario> listAll() {
		
		List<CadUsuario> lista = new ArrayList<CadUsuario>();

		String hql = null;
		hql = "from CadUsuario";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public CadUsuario login(CadUsuario u){
		
		List<CadUsuario> lista = new ArrayList<CadUsuario>();
		
		String hql = null;
		hql = "FROM CadUsuario WHERE user= '"+ u.getNick()+"' AND senha = '" + u.getSenha() + "'";
		
		try {
			javax.persistence.Query query = getEntityManager().createQuery(hql);
			lista.addAll(query.getResultList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (lista.size() > 0) {
			CadUsuario usu = (CadUsuario) lista.get(0); 
			return usu;
		}
		
		return null;
	}


}
