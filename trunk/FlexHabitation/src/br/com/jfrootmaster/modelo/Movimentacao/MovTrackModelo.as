package br.com.jfrootmaster.modelo.Movimentacao{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Movimentacao.MovTrack")]
	
	public class MovTrackModelo{	
		public var id_track:uint;
		public var data:Date;
		public var id_usuario:uint;
		public var titulo_track:String;
		public var track:String;
		public var id_status_track:uint;
		public var id_prioridade:String;
		public var id_usuario_destino:uint;
		public var id_tarefa:uint;
		
		public var nome_usuario:String;
		public var status_track:String;
		public var tarefa:String;
		public var usuario_destino:String;
		public var cor:String;
		public var prioridade:String;
	}
}