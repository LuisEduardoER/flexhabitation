package br.com.jfrootmaster.modelo.Cadastro{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Cadastro.CadImoveis")]
	
	public class CadImoveisModelo{
	
		public var id_imovel:uint;
		public var tipo_imovel:String;
		public var finalidade:String;
		public var endereco:String;
		public var complemento:String;
		public var numero:String;
		public var bairro:String;
		public var cidade:String;
		public var estado:String;
		public var area_terreno:String;
		public var area_construida:String;
		public var area_util:String;
		public var topografia:String;
		public var permite_placa:uint;
		public var valor_venda:Number;
		public var valor_locacao:Number;
		public var valor_condominio:Number;
		public var valor_iptu:Number;
		public var cond_pgto:String;
		public var financiado:uint;
		public var num_dormitorios:uint;
		public var num_suites:uint;
		public var num_vagas_garagem:uint;
		public var garagem:uint;
		public var sala_estar:uint;
		public var sala_jantar:uint;
		public var sala_tv:uint;
		public var pscina:uint;
		public var churrasqueira:uint;
		public var dep_empregada:uint;
		public var copa:uint;
		public var cozinha:uint;
		public var area_servico:uint;
		public var observacao:String;
		public var objetivo:String;
		public var email_contato:String;
		public var data_cadastro:Date
	}
}