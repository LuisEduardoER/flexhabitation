package br.com.jfrootmaster.modelo.Movimentacao;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.jfrootmaster.dao.Movimentacao.MovTrackDAO;

@Entity
@Table(name="mov_track")
public class MovTrack {

	public MovTrack() {
		super();
	}
	
	public MovTrack(MovTrack movtrack, String nome_usuario,String status_track,String tarefa,String usuario_destino, String cor, String prioridade) {
		this.id_track				= movtrack.getId_track();
		this.data				    = movtrack.getData();
		this.id_usuario				= movtrack.getId_usuario();
		this.titulo_track			= movtrack.getTitulo_track();
		this.track					= movtrack.getTrack();
		this.id_status_track		= movtrack.getId_status_track();	
		this.id_tarefa				= movtrack.getId_tarefa();
		this.id_usuario_destino	    = movtrack.getId_usuario_destino();
		this.id_prioridade			= movtrack.getId_prioridade();
		this.nome_usuario			= nome_usuario;
		this.status_track	        = status_track;
		this.tarefa			   		= tarefa;
		this.usuario_destino	    = usuario_destino;
		this.cor				    = cor;
		this.prioridade  		    = prioridade;

	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_track", nullable= false)
	private Integer id_track;
	private Timestamp data;
	private Integer id_usuario;
	private String titulo_track;
	private String track;
	private Integer id_status_track;
	private Integer id_tarefa;
	private Integer id_usuario_destino;
	private String id_prioridade;
	
	@Transient
	private String nome_usuario;
	
	@Transient
	private String status_track;
	
	@Transient
	private String tarefa;
	
	@Transient
	private String usuario_destino;
	
	@Transient
	private String cor;
	
	@Transient
	private String prioridade;
	
	
	/* Methods */
	
	public MovTrack incluir(MovTrack obj) {
		obj.setId_track(null);
		MovTrackDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(MovTrack MovTrack) {
		MovTrackDAO.getInstance().saveUpdate(MovTrack);
	}
	
	public void excluir(MovTrack MovTrack) {
		MovTrackDAO.getInstance().delete(MovTrack);
	}
	
	public List<MovTrack> listar() {
		return MovTrackDAO.getInstance().listAll();
	}
	
	public List<MovTrack> listarPorUsuario(Integer id_usuario) {
		return MovTrackDAO.getInstance().listaPorUsuario(id_usuario);
	}

	/* Getters and Setters */
	
	public Integer getId_track() {
		return id_track;
	}

	public void setId_track(Integer id_track) {
		this.id_track = id_track;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getTitulo_track() {
		return titulo_track;
	}

	public void setTitulo_track(String titulo_track) {
		this.titulo_track = titulo_track;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public Integer getId_status_track() {
		return id_status_track;
	}

	public void setId_status_track(Integer id_status_track) {
		this.id_status_track = id_status_track;
	}

	public Integer getId_tarefa() {
		return id_tarefa;
	}

	public void setId_tarefa(Integer id_tarefa) {
		this.id_tarefa = id_tarefa;
	}

	public Integer getId_usuario_destino() {
		return id_usuario_destino;
	}

	public void setId_usuario_destino(Integer id_usuario_destino) {
		this.id_usuario_destino = id_usuario_destino;
	}

	public String getId_prioridade() {
		return id_prioridade;
	}

	public void setId_prioridade(String id_prioridade) {
		this.id_prioridade = id_prioridade;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getStatus_track() {
		return status_track;
	}

	public void setStatus_track(String status_track) {
		this.status_track = status_track;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public String getUsuario_destino() {
		return usuario_destino;
	}

	public void setUsuario_destino(String usuario_destino) {
		this.usuario_destino = usuario_destino;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

}
