package br.com.jfrootmaster.modelo.Cadastro{
	
	[Bindable]
	[RemoteClass(alias="br.com.cba.modelo.Cadastro.CadCargo")]
	
	public class CadCargoModelo{
		public var id_cargo:uint;
		public var cargo:String;
		public var id_setor:uint;
	}
}