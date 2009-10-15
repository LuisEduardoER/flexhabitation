package br.com.jfrootmaster.modelo.Movimentacao;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Movimentacao.HistoricoAtendenteDAO;

@Entity
@Table(name="historico_atendente")
public class HistoricoAtendente {

	public HistoricoAtendente() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_historico_atendente", nullable= false)
	private Integer id_historico_atendente;
	private Integer id_track;
	private Timestamp data;
	private String causa;
	private Integer id_usuario_destino;

	/* Methods */
	
	public HistoricoAtendente incluir(HistoricoAtendente obj) {
		obj.setId_historico_atendente(null);
		HistoricoAtendenteDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(HistoricoAtendente HistoricoAtendente) {
		HistoricoAtendenteDAO.getInstance().saveUpdate(HistoricoAtendente);
	}
	
	public void excluir(HistoricoAtendente HistoricoAtendente) {
		HistoricoAtendenteDAO.getInstance().delete(HistoricoAtendente);
	}
	
	public List<HistoricoAtendente> listar() {
		return HistoricoAtendenteDAO.getInstance().listAll();
	}
	
	/* Getters and Setters */

	public Integer getId_historico_atendente() {
		return id_historico_atendente;
	}

	public void setId_historico_atendente(Integer id_historico_atendente) {
		this.id_historico_atendente = id_historico_atendente;
	}

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

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public Integer getId_usuario_destino() {
		return id_usuario_destino;
	}

	public void setId_usuario_destino(Integer id_usuario_destino) {
		this.id_usuario_destino = id_usuario_destino;
	}	

}
