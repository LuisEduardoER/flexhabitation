package br.com.jfrootmaster.modelo.email;


public class Teste2 {

	public Teste2() {
		super();
	}
	
	public Teste2(String mensagemHtml, String de, String assunto, String para) {
		this.assunto = assunto;
		this.de = de;
		this.mensagemHtml = mensagemHtml;
		this.para= para;
		}
	
	
	
	private String mensagemHtml;
	private String de;
	private String assunto;
	private String para;
	public String getMensagemHtml() {
		return mensagemHtml;
	}

	public void setMensagemHtml(String mensagemHtml) {
		this.mensagemHtml = mensagemHtml;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	};
	
	
	//gets and sets
	
}
