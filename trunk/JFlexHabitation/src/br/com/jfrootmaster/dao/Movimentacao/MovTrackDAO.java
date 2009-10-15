package br.com.jfrootmaster.dao.Movimentacao;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Movimentacao.MovTrack;

public class MovTrackDAO extends BaseDao<Object> {

	public static MovTrackDAO instance;

	public static MovTrackDAO getInstance() {
		try {
			if (null == instance) instance = new MovTrackDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(MovTrack obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(MovTrack obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(MovTrack obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public MovTrack load(String key) {
		
		MovTrack obj;
		obj =  getEntityManager().find(MovTrack.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<MovTrack> listAll() {
		
		List<MovTrack> lista = new ArrayList<MovTrack>();

		String hql = null;
		//hql = "from MovTrack";
		hql = "SELECT NEW MovTrack(t, cu.nome,st.status_track,tsk.tarefa,cu.nome,cp.id_cor,cp.nome)" +
				" FROM MovTrack t, CadStatusTrack st, CadTarefa tsk, CadUsuario cu, CadPrioridade cp" +
				" WHERE t.id_status_track = st.id_status_track" +
				" AND t.id_tarefa = tsk.id_tarefa" +
				" AND t.id_usuario_destino = cu.id_usuario" +
				" AND t.id_prioridade = cp.id_prioridade";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<MovTrack> listaPorUsuario(Integer id_usuario) {
		
		List<MovTrack> lista = new ArrayList<MovTrack>();

		String hql = null;
		//hql = "from MovTrack";
		hql = "SELECT NEW MovTrack(t, cu.nome,st.status_track,tsk.tarefa,cu.nome,cp.id_cor,cp.nome)" +
				" FROM MovTrack t, CadStatusTrack st, CadTarefa tsk, CadUsuario cu, CadPrioridade cp" +
				" WHERE t.id_status_track = st.id_status_track" +
				" AND t.id_tarefa = tsk.id_tarefa" +
				" AND t.id_usuario_destino = cu.id_usuario" +
				" AND t.id_prioridade = cp.id_prioridade" +
				" AND t.id_usuario_destino = :id_usuario" +
				" AND t.id_status_track in (1)";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		query.setParameter("id_usuario",id_usuario);
		lista.addAll(query.getResultList());
			
		return lista;
	}
	
}

