package br.com.jfrootmaster.modelo.Movimentacao;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Movimentacao.MovTrackCheckDAO;

@Entity
@Table(name="mov_track_check")
public class MovTrackCheck {

	public MovTrackCheck() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_track_check", nullable= false)
	private Integer id_track_check;
	private Integer id_track;
	private Integer id_track_exec;
	private Integer id_usuario;
	private Timestamp data;
	private String observacao;
	private String avaliacao;
	
	/* Methods */
	
	public MovTrackCheck incluir(MovTrackCheck obj) {
		obj.setId_track_check(null);
		MovTrackCheckDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(MovTrackCheck MovTrackCheck) {
		MovTrackCheckDAO.getInstance().saveUpdate(MovTrackCheck);
	}
	
	public void excluir(MovTrackCheck MovTrackCheck) {
		MovTrackCheckDAO.getInstance().delete(MovTrackCheck);
	}
	
	public List<MovTrackCheck> listar() {
		return MovTrackCheckDAO.getInstance().listAll();
	}

	/* Getters and Setters */
	
	public Integer getId_track_check() {
		return id_track_check;
	}

	public void setId_track_check(Integer id_track_check) {
		this.id_track_check = id_track_check;
	}

	public Integer getId_track() {
		return id_track;
	}

	public void setId_track(Integer id_track) {
		this.id_track = id_track;
	}

	public Integer getId_track_exec() {
		return id_track_exec;
	}

	public void setId_track_exec(Integer id_track_exec) {
		this.id_track_exec = id_track_exec;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
