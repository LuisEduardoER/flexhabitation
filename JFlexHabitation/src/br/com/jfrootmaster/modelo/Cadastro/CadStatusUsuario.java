package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadStatusUsuarioDAO;

@Entity
@Table(name="cad_status_usuario")
public class CadStatusUsuario {

	public CadStatusUsuario() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_status_usuario", nullable= false)
    private Integer id_status_usuario;
    private String status_usuario;
	
	/* Methods */
	
	public CadStatusUsuario incluir(CadStatusUsuario obj) {
		obj.setId_status_usuario(null);
		CadStatusUsuarioDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadStatusUsuario CadStatusUsuario) {
		CadStatusUsuarioDAO.getInstance().saveUpdate(CadStatusUsuario);
	}
	
	public void excluir(CadStatusUsuario CadStatusUsuario) {
		CadStatusUsuarioDAO.getInstance().delete(CadStatusUsuario);
	}
	
	public List<CadStatusUsuario> listar() {
		return CadStatusUsuarioDAO.getInstance().listAll();
	}

	/* Getters and Setters */
	
	public Integer getId_status_usuario() {
		return id_status_usuario;
	}

	public void setId_status_usuario(Integer id_status_usuario) {
		this.id_status_usuario = id_status_usuario;
	}

	public String getStatus_usuario() {
		return status_usuario;
	}

	public void setStatus_usuario(String status_usuario) {
		this.status_usuario = status_usuario;
	}

}
