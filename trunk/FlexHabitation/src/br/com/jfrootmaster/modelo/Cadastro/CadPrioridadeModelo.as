package br.com.jfrootmaster.modelo.Cadastro{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Cadastro.CadPrioridade")]
	
	public class CadPrioridadeModelo{
		public var id_prioridade:uint;
		public var nome:String
		public var grau:uint;
		public var id_cor:String;
	}
}