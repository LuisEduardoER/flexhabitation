package br.com.jfrootmaster.modelo.Cadastro;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadImoveisDAO;;

@Entity
@Table(name="cad_imoveis")
public class CadImoveis {

	public CadImoveis() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_imovel", nullable= false)
	private Integer id_imovel;
	private String tipo_imovel;
	private String finalidade;
	private String endereco;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String area_terreno;
	private String area_construida;
	private String area_util;
	private String topografia;
	private Integer permite_placa;
	private Double valor_venda;
	private Double valor_locacao;
	private Double valor_condominio;
	private Double valor_iptu;
	private String cond_pgto;
	private Integer financiado;
	private Integer num_dormitorios;
	private Integer num_suites;
	private Integer num_vagas_garagem;
	private Integer garagem;
	private Integer sala_estar;
	private Integer sala_jantar;
	private Integer sala_tv;
	private Integer pscina;
	private Integer churrasqueira;
	private Integer dep_empregada;
	private Integer copa;
	private Integer cozinha;
	private Integer area_servico;
	private String observacao;
	private String objetivo;
	private String email_contato;
	private Date data_cadastro;
	
	
	/* Methods */
	public CadImoveis incluir(CadImoveis obj) {
		obj.setId_imovel(null);
		CadImoveisDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadImoveis CadImoveis) {
		CadImoveisDAO.getInstance().saveUpdate(CadImoveis);
	}
	
	public void excluir(CadImoveis CadImoveis) {
		CadImoveisDAO.getInstance().delete(CadImoveis);
	}
	
	public List<CadImoveis> listar() {
		return CadImoveisDAO.getInstance().listAll();
	}
	
	public List<CadImoveis> buscarImovel(Integer id_imovel, String tipo_imovel, String finalidade, String cidade, String bairro, String estado,
			String objetivo,Integer num_dormitorios_min,Integer num_dormitorios_max, Integer num_suites_min,Integer num_suites_max, Integer num_vagas_garagem_min, Integer num_vagas_garagem_max) {
		return CadImoveisDAO.getInstance().buscarImoveis(id_imovel, tipo_imovel, finalidade, cidade, bairro, estado, objetivo, num_dormitorios_min, num_dormitorios_max, num_suites_min, num_suites_max, num_vagas_garagem_min, num_vagas_garagem_max);
	}
	
	/* Getters and Setters */

	public Integer getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(Integer id_imovel) {
		this.id_imovel = id_imovel;
	}

	public String getTipo_imovel() {
		return tipo_imovel;
	}

	public void setTipo_imovel(String tipo_imovel) {
		this.tipo_imovel = tipo_imovel;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public String getArea_terreno() {
		return area_terreno;
	}

	public void setArea_terreno(String area_terreno) {
		this.area_terreno = area_terreno;
	}

	public String getArea_construida() {
		return area_construida;
	}

	public void setArea_construida(String area_construida) {
		this.area_construida = area_construida;
	}

	public String getArea_util() {
		return area_util;
	}

	public void setArea_util(String area_util) {
		this.area_util = area_util;
	}

	public String getTopografia() {
		return topografia;
	}

	public void setTopografia(String topografia) {
		this.topografia = topografia;
	}

	public Integer getPermite_placa() {
		return permite_placa;
	}

	public void setPermite_placa(Integer permite_placa) {
		this.permite_placa = permite_placa;
	}

	public Double getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(Double valor_venda) {
		this.valor_venda = valor_venda;
	}

	public Double getValor_locacao() {
		return valor_locacao;
	}

	public void setValor_locacao(Double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	public Double getValor_condominio() {
		return valor_condominio;
	}

	public void setValor_condominio(Double valor_condominio) {
		this.valor_condominio = valor_condominio;
	}

	public Double getValor_iptu() {
		return valor_iptu;
	}

	public void setValor_iptu(Double valor_iptu) {
		this.valor_iptu = valor_iptu;
	}

	public String getCond_pgto() {
		return cond_pgto;
	}

	public void setCond_pgto(String cond_pgto) {
		this.cond_pgto = cond_pgto;
	}

	public Integer getFinanciado() {
		return financiado;
	}

	public void setFinanciado(Integer financiado) {
		this.financiado = financiado;
	}

	public Integer getNum_dormitorios() {
		return num_dormitorios;
	}

	public void setNum_dormitorios(Integer num_dormitorios) {
		this.num_dormitorios = num_dormitorios;
	}

	public Integer getNum_suites() {
		return num_suites;
	}

	public void setNum_suites(Integer num_suites) {
		this.num_suites = num_suites;
	}

	public Integer getNum_vagas_garagem() {
		return num_vagas_garagem;
	}

	public void setNum_vagas_garagem(Integer num_vagas_garagem) {
		this.num_vagas_garagem = num_vagas_garagem;
	}

	public Integer getGaragem() {
		return garagem;
	}

	public void setGaragem(Integer garagem) {
		this.garagem = garagem;
	}

	public Integer getSala_estar() {
		return sala_estar;
	}

	public void setSala_estar(Integer sala_estar) {
		this.sala_estar = sala_estar;
	}

	public Integer getSala_jantar() {
		return sala_jantar;
	}

	public void setSala_jantar(Integer sala_jantar) {
		this.sala_jantar = sala_jantar;
	}

	public Integer getSala_tv() {
		return sala_tv;
	}

	public void setSala_tv(Integer sala_tv) {
		this.sala_tv = sala_tv;
	}

	public Integer getPscina() {
		return pscina;
	}

	public void setPscina(Integer pscina) {
		this.pscina = pscina;
	}

	public Integer getChurrasqueira() {
		return churrasqueira;
	}

	public void setChurrasqueira(Integer churrasqueira) {
		this.churrasqueira = churrasqueira;
	}

	public Integer getDep_empregada() {
		return dep_empregada;
	}

	public void setDep_empregada(Integer dep_empregada) {
		this.dep_empregada = dep_empregada;
	}

	public Integer getCopa() {
		return copa;
	}

	public void setCopa(Integer copa) {
		this.copa = copa;
	}

	public Integer getCozinha() {
		return cozinha;
	}

	public void setCozinha(Integer cozinha) {
		this.cozinha = cozinha;
	}

	public Integer getArea_servico() {
		return area_servico;
	}

	public void setArea_servico(Integer area_servico) {
		this.area_servico = area_servico;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
}
