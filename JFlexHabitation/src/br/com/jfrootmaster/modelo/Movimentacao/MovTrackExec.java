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

import br.com.jfrootmaster.dao.Movimentacao.MovTrackExecDAO;

@Entity
@Table(name="mov_track_exec")
public class MovTrackExec {

	public MovTrackExec() {
		super();
	}
	
	public MovTrackExec(MovTrackExec movtrackexec, String titulo_track, String track, String nome_usuario, String status_track, String tarefa, String usuario_destino, String cor, String prioridade) {
		this.id_track_exec		    = movtrackexec.getId_track_exec();
		this.id_track				= movtrackexec.getId_track();
		this.id_usuario				= movtrackexec.getId_usuario();
		this.data_inicio			= movtrackexec.getData_inicio();
		this.data_fim				= movtrackexec.getData_fim();
		this.operacao_efetuada		= movtrackexec.getOperacao_efetuada();	
		this.titulo_track			= titulo_track;
		this.track					= track;
		this.nome_usuario			= nome_usuario;
		this.status_track			= status_track;
		this.tarefa					= tarefa;
		this.usuario_destino		= usuario_destino;
		this.cor					= cor;
		this.prioridade				= prioridade;
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_track_exec", nullable= false)
	private Integer id_track_exec;
	private Integer id_track;
	private Integer id_usuario;
	private Timestamp data_inicio;
	private Timestamp data_fim;
	private String operacao_efetuada;
	
	@Transient
	private String titulo_track;
	
	@Transient
	private String track;
	
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
	
	public MovTrackExec incluir(MovTrackExec obj) {
		obj.setId_track_exec(null);
		MovTrackExecDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(MovTrackExec MovTrackExec) {
		MovTrackExecDAO.getInstance().saveUpdate(MovTrackExec);
	}
	
	public void excluir(MovTrackExec MovTrackExec) {
		MovTrackExecDAO.getInstance().delete(MovTrackExec);
	}
	
	public List<MovTrackExec> listar() {
		return MovTrackExecDAO.getInstance().listAll();
	}

	/* Getters and Setters */
	
	public Integer getId_track_exec() {
		return id_track_exec;
	}

	public void setId_track_exec(Integer id_track_exec) {
		this.id_track_exec = id_track_exec;
	}

	public Integer getId_track() {
		return id_track;
	}

	public void setId_track(Integer id_track) {
		this.id_track = id_track;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Timestamp getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Timestamp data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Timestamp getData_fim() {
		return data_fim;
	}

	public void setData_fim(Timestamp data_fim) {
		this.data_fim = data_fim;
	}

	public String getOperacao_efetuada() {
		return operacao_efetuada;
	}

	public void setOperacao_efetuada(String operacao_efetuada) {
		this.operacao_efetuada = operacao_efetuada;
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
