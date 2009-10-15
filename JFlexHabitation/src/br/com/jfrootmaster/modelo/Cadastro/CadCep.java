package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadCepDAO;

@Entity
@Table(name="cad_cep")
public class CadCep {

	public CadCep() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id", nullable= false)
	private Integer id;
	private String cidade;
	private String rua;
	private String bairro;
	private String cep;
	private String logradouro;
	private String estado;
	private String pais;
	
	/* Methods */
	
	public CadCep incluir(CadCep obj) {
		obj.setId(null);
		CadCepDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadCep CadCep) {
		CadCepDAO.getInstance().saveUpdate(CadCep);
	}
	
	public void excluir(CadCep CadCep) {
		CadCepDAO.getInstance().delete(CadCep);
	}
	
	public List<CadCep> listar() {
		return CadCepDAO.getInstance().listAll();
	}

	public List<CadCep> listar2(String cep) {
		return CadCepDAO.getInstance().listarPorCep(cep);
	}
	
	/* Getters and Setters */

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
