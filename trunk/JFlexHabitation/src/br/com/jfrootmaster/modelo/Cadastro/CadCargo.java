package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadCargoDAO;

@Entity
@Table(name="cad_cargo")
public class CadCargo {

	public CadCargo() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_cargo", nullable= false)
	private Integer id_cargo;
	private String cargo;
	private Integer id_setor;
	
	/* Methods */
	
	public CadCargo incluir(CadCargo obj) {
		obj.setId_cargo(null);
		CadCargoDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadCargo CadCargo) {
		CadCargoDAO.getInstance().saveUpdate(CadCargo);
	}
	
	public void excluir(CadCargo CadCargo) {
		CadCargoDAO.getInstance().delete(CadCargo);
	}
	
	public List<CadCargo> listar() {
		return CadCargoDAO.getInstance().listAll();
	}
	
	/* Getters and Setters */

	public Integer getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getId_setor() {
		return id_setor;
	}

	public void setId_setor(Integer id_setor) {
		this.id_setor = id_setor;
	}
	
}
