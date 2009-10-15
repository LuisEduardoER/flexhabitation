package br.com.jfrootmaster.modelo.register{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.register.CadCep")]
	
	public class CadCepModelo{
		public var id:uint;
		public var cidade:String;
		public var rua:String;
		public var bairro:String;
		public var cep:String;
		public var logradouro:String;
		public var estado:String;
		public var pais:String;
	}
}