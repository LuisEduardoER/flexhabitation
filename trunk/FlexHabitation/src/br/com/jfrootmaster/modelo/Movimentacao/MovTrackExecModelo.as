package br.com.jfrootmaster.modelo.Movimentacao{
	
	[Bindable]
	[RemoteClass(alias="br.com.jfrootmaster.modelo.Movimentacao.MovTrackExec")]
	
	public class MovTrackExecModelo{	
		public var id_track_exec:uint;
		public var id_track:uint;
		public var id_usuario:uint;
		public var data_inicio:Date;;
		public var data_fim:Date;
		public var operacao_efetuada:String;
		
		public var titulo_track:String;
		public var track:String;
		public var nome_usuario:String;
		public var status_track:String;
		public var tarefa:String;
		public var usuario_destino:String;
		public var cor:String;
		public var prioridade:String;
	}
}