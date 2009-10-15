package br.com.jfrootmaster.modelo.Movimentacao{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Movimentacao.MovTrackCheck")]
	
	public class MovTrackCheckModelo{	
		public var id_check_Track:uint;
		public var id_track:uint;
		public var id_execute_track:uint;
		public var id_user:uint;
		public var data_hour:Date;
		public var observation:String;
		public var assessment:uint;
	}
}