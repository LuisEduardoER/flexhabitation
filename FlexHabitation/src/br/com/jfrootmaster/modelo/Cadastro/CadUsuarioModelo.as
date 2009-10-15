package br.com.jfrootmaster.modelo.Cadastro{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Cadastro.CadUsuario")]
	
	public class CadUsuarioModelo{
	
		public var id_usuario:uint;
		public var id_cargo:uint;
		public var nome:String;
		public var sobrenome:String;
		public var nick:String;
		public var rg:String;
		public var cpf:String;
		public var endereco:String;
		public var numero:String;
		public var cep:String;
		public var bairro:String;
		public var cidade:String;
		public var estado:String
		public var pais:String;
		public var source_foto:String;
		public var senha:String;
		public var id_mensagem_chave:uint;
		public var resposta_mensagem_chave:String;
		public var data_cadastro:Date;
		public var id_status_usuario:uint;
		public var inativo:String;
		public var telefone:String;
		public var celular:String;
		public var ramal:String;
	}
}