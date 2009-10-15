package br.com.jfrootmaster.dao.Movimentacao;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Movimentacao.MovTrackExec;

public class MovTrackExecDAO extends BaseDao<Object> {

	public static MovTrackExecDAO instance;

	public static MovTrackExecDAO getInstance() {
		try {
			if (null == instance) instance = new MovTrackExecDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(MovTrackExec obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(MovTrackExec obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(MovTrackExec obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public MovTrackExec load(String key) {
		
		MovTrackExec obj;
		obj =  getEntityManager().find(MovTrackExec.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<MovTrackExec> listAll() {
		
		List<MovTrackExec> lista = new ArrayList<MovTrackExec>();

		String hql = null;
		//hql = "from MovTrackExec";
//		hql = "SELECT NEW MovTrackExec(te, mt.titulo_track, mt.track, cu.nome_usuario, st.status_track, ct.tarefa, cu.usuario_destino, cp.cor, cp.prioridade)" +
//				" FROM MovTrackExec te, MovTrack mt, CadStatusTrack st" +
//				" WHERE te.id_track = mt.id_track" +
//				" AND mt.id_status_track = st.id_status_track";
		
		hql = "SELECT NEW MovTrackExec(te, mt.titulo_track, mt.track, cu.nome, st.status_track, ct.tarefa, cu.nome, cp.id_cor, cp.nome)" +
		" FROM MovTrackExec te, MovTrack mt, CadStatusTrack st, CadUsuario cu, CadPrioridade cp, CadTarefa ct" +
		" WHERE te.id_track = mt.id_track" +
		" AND mt.id_status_track = st.id_status_track" +
		" AND mt.id_status_track = st.id_status_track" +
		" AND mt.id_tarefa = ct.id_tarefa" +
		" AND mt.id_usuario_destino = cu.id_usuario" +
		" AND mt.id_prioridade = cp.id_prioridade";
				
		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

