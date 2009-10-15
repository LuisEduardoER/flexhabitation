package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadPrioridadeDAO;;

@Entity
@Table(name="cad_prioridade")
public class CadPrioridade {

	public CadPrioridade() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_prioridade", nullable= false)
	private Integer id_prioridade;
	private String nome;
	private Integer grau;
	private String id_cor;
	
	/* Methods */
	
	public CadPrioridade incluir(CadPrioridade obj) {
		obj.setId_prioridade(null);
		CadPrioridadeDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadPrioridade CadPrioridade) {
		CadPrioridadeDAO.getInstance().saveUpdate(CadPrioridade);
	}
	
	public void excluir(CadPrioridade CadPrioridade) {
		CadPrioridadeDAO.getInstance().delete(CadPrioridade);
	}
	
	public List<CadPrioridade> listar() {
		return CadPrioridadeDAO.getInstance().listAll();
	}

	/* Getters and Setters */
	
	public Integer getId_prioridade() {
		return id_prioridade;
	}

	public void setId_prioridade(Integer id_prioridade) {
		this.id_prioridade = id_prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getGrau() {
		return grau;
	}

	public void setGrau(Integer grau) {
		this.grau = grau;
	}

	public String getId_cor() {
		return id_cor;
	}

	public void setId_cor(String id_cor) {
		this.id_cor = id_cor;
	}	
	
}
