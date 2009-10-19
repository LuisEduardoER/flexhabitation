package br.com.jfrootmaster.modelo.email{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.email.enviarEmail")]
	
	public class emailModelo{	
		public var servidor:String;
		public var assunto:String;
		public var para:String;
		public var de:String;
		public var mensagem:String;
	}
}