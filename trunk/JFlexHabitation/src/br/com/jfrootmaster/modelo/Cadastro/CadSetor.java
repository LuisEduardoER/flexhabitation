package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadSetorDAO;

@Entity
@Table(name="cad_setor")
public class CadSetor {

	public CadSetor() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_setor", nullable= false)
	private Integer id_setor;
	private String setor;
	
	/* Methods */
	
	public CadSetor incluir(CadSetor obj) {
		obj.setId_setor(null);
		CadSetorDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadSetor CadSetor) {
		CadSetorDAO.getInstance().saveUpdate(CadSetor);
	}
	
	public void excluir(CadSetor CadSetor) {
		CadSetorDAO.getInstance().delete(CadSetor);
	}
	
	/* Getters and Setters */
	
	public List<CadSetor> listar() {
		return CadSetorDAO.getInstance().listAll();
	}

	public Integer getId_setor() {
		return id_setor;
	}

	public void setId_setor(Integer id_setor) {
		this.id_setor = id_setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
