package br.com.jfrootmaster.rpc;

import java.util.List;

import br.com.jfrootmaster.modelo.Movimentacao.*;
public class Movimentacao  {

//Inicio Track//	
	public List<MovTrack> MovTrackListar() {
		return new MovTrack().listar();
	}
	
	public List<MovTrack> MovTrackListarPorUsuario(Integer id_usuario) {
		return new MovTrack().listarPorUsuario(id_usuario);
	}
	
	private MovTrack t = new MovTrack();
	public MovTrack MovTrackIncluir(MovTrack obj) {
		
		MovTrack MovTrack = t.incluir(obj); 
		
		return MovTrack;
	}
	
	public List<MovTrack> MovTrackAlterar(MovTrack id) {
		new MovTrack().alterar(id);

		return MovTrackListar();
	}
	
	public List<MovTrack> MovTrackExcluir(MovTrack obj) {
		try{
			new MovTrack().excluir(obj);
			return MovTrackListar();
		} catch (Exception e) {
			return null;
		}
	}
	//Fim MovTrack//
	
	//Inicio ExecuteMovTrack//	
	public List<MovTrackExec> MovTrackExecListar() {
		return new MovTrackExec().listar();
	}
	
	private MovTrackExec et = new MovTrackExec();
	public MovTrackExec MovTrackExecIncluir(MovTrackExec obj) {
		
		MovTrackExec MovTrackExec = et.incluir(obj); 
		
		return MovTrackExec;
	}
	
	public List<MovTrackExec> MovTrackExecAlterar(MovTrackExec id) {
		new MovTrackExec().alterar(id);

		return MovTrackExecListar();
	}
	
	public List<MovTrackExec> MovTrackExecExcluir(MovTrackExec obj) {
		try{
			new MovTrackExec().excluir(obj);
			return MovTrackExecListar();
		} catch (Exception e) {
			return null;
		}
	}
	//Fim ExecuteMovTrackExec//
	
	//Inicio HistoryDestination//	
	public List<HistoricoAtendente> HistoricoAtendenteListar() {
		return new HistoricoAtendente().listar();
	}
	
	private HistoricoAtendente hd = new HistoricoAtendente();
	public HistoricoAtendente HistoricoAtendenteIncluir(HistoricoAtendente obj) {
		
		HistoricoAtendente HistoricoAtendente = hd.incluir(obj); 
		
		return HistoricoAtendente;
	}
	
	public List<HistoricoAtendente> HistoricoAtendenteAlterar(HistoricoAtendente id) {
		new HistoricoAtendente().alterar(id);

		return HistoricoAtendenteListar();
	}
	
	public List<HistoricoAtendente> HistoricoAtendenteExcluir(HistoricoAtendente obj) {
		try{
			new HistoricoAtendente().excluir(obj);
			return HistoricoAtendenteListar();
		} catch (Exception e) {
			return null;
		}
	}
	//Fim ExecuteHistoricoAtendente//

}
