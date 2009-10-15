package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadStatusTrackDAO;

@Entity
@Table(name="cad_status_track")
public class CadStatusTrack {

	public CadStatusTrack() {
		super();
	}
	
	public CadStatusTrack(CadStatusTrack cst) {
		this.setId_status_track(cst.getId_status_track());
		this.setStatus_track(cst.getStatus_track());
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_status_track", nullable= false)
	private Integer id_status_track;
	private String status_track;
	
	/* Methods */
	
	public CadStatusTrack incluir(CadStatusTrack obj) {
		obj.setId_status_track(null);
		CadStatusTrackDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadStatusTrack CadStatusTrack) {
		CadStatusTrackDAO.getInstance().saveUpdate(CadStatusTrack);
	}
	
	public void excluir(CadStatusTrack CadStatusTrack) {
		CadStatusTrackDAO.getInstance().delete(CadStatusTrack);
	}
	
	public List<CadStatusTrack> listar() {
		return CadStatusTrackDAO.getInstance().listAll();
	}
	
	/* Getters and Setters */

	public Integer getId_status_track() {
		return id_status_track;
	}

	public void setId_status_track(Integer id_status_track) {
		this.id_status_track = id_status_track;
	}

	public String getStatus_track() {
		return status_track;
	}

	public void setStatus_track(String status_track) {
		this.status_track = status_track;
	}
	
}
