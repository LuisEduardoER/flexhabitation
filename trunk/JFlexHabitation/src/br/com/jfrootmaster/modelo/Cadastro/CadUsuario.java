package br.com.jfrootmaster.modelo.Cadastro;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadUsuarioDAO;

@Entity
@Table(name="cad_usuario")
public class CadUsuario {

	public CadUsuario() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_usuario", nullable= false)
	private Integer id_usuario;
	private Integer id_cargo;
	private String nome;
	private String sobrenome;
	private String nick;
	private String rg;
	private String cpf;
	private String endereco;
	private String numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String source_foto;
	private String senha;
	private Integer id_mensagem_chave;
	private String resposta_mensagem_chave;
	private Timestamp data_cadastro;
	private Integer id_status_usuario;
	private Integer inativo;
	private String telefone;
	private String celular;
	private String ramal;

	/* Methods */
	
	public CadUsuario incluir(CadUsuario id) {
		id.setId_usuario(null);
		CadUsuarioDAO.getInstance().saveInsert(id);
		return id;
	}
	
	public void alterar(CadUsuario obj) {
		CadUsuarioDAO.getInstance().saveUpdate(obj);
	}
	
	public void excluir(Integer key) {
		CadUsuarioDAO.getInstance().delete(key);
	}
	
	public List<CadUsuario> listar() {
		return CadUsuarioDAO.getInstance().listAll();
	}
	
	public CadUsuario login(CadUsuario u){
		return CadUsuarioDAO.getInstance().login(u);
	}

	/* Getters and Setters */
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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

	public String getSource_foto() {
		return source_foto;
	}

	public void setSource_foto(String source_foto) {
		this.source_foto = source_foto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId_mensagem_chave() {
		return id_mensagem_chave;
	}

	public void setId_mensagem_chave(Integer id_mensagem_chave) {
		this.id_mensagem_chave = id_mensagem_chave;
	}

	public String getResposta_mensagem_chave() {
		return resposta_mensagem_chave;
	}

	public void setResposta_mensagem_chave(String resposta_mensagem_chave) {
		this.resposta_mensagem_chave = resposta_mensagem_chave;
	}

	public Timestamp getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Timestamp data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Integer getId_status_usuario() {
		return id_status_usuario;
	}

	public void setId_status_usuario(Integer id_status_usuario) {
		this.id_status_usuario = id_status_usuario;
	}

	public Integer getInativo() {
		return inativo;
	}

	public void setInativo(Integer inativo) {
		this.inativo = inativo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
}
