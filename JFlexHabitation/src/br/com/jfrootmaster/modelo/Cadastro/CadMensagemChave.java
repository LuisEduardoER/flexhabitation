package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadMensagemChaveDAO;

@Entity
@Table(name="cad_mensagem_chave")
public class CadMensagemChave {

	public CadMensagemChave() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_mensagem_chave", nullable= false)
	private Integer id_mensagem_chave;
	private String mensagem_chave;
	
	/* Methods */
	
	public CadMensagemChave incluir(CadMensagemChave obj) {
		obj.setId_mensagem_chave(null);
		CadMensagemChaveDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadMensagemChave CadMensagemChave) {
		CadMensagemChaveDAO.getInstance().saveUpdate(CadMensagemChave);
	}
	
	public void excluir(CadMensagemChave CadMensagemChave) {
		CadMensagemChaveDAO.getInstance().delete(CadMensagemChave);
	}
	
	/* Getters and Setters */
	
	public List<CadMensagemChave> listar() {
		return CadMensagemChaveDAO.getInstance().listAll();
	}

	public Integer getId_mensagem_chave() {
		return id_mensagem_chave;
	}

	public void setId_mensagem_chave(Integer id_mensagem_chave) {
		this.id_mensagem_chave = id_mensagem_chave;
	}

	public String getMensagem_chave() {
		return mensagem_chave;
	}

	public void setMensagem_chave(String mensagem_chave) {
		this.mensagem_chave = mensagem_chave;
	}
	
}
