package br.com.jfrootmaster.dataprovider{
	
	import mx.collections.ArrayCollection;
	
	
	[Bindable]
	public class RepositorioDataProviders{
		
		public var tipoImoveis:ArrayCollection = new ArrayCollection(
				[ {tipo:"Casa", id:'1'},
				{tipo:"Sobrado", id:'2'},
				{tipo:"Apartamento", id:'3'},
				{tipo:"KiNet", id:'4'},
				{tipo:"Galpão", id:'5'},
				{tipo:"Terreno", id:'6'}
		]);
		
		public var finalidadeImovel:ArrayCollection = new ArrayCollection(
				[ {tipo:"Residencial", id:'1'},
				{tipo:"Comercial", id:'2'},
				{tipo:"Temporada", id:'3'}
		]);
		
		public var topografiaTerreno:ArrayCollection = new ArrayCollection(
				[ {tipo:"Aclive", id:'1'},
				{tipo:"Declive", id:'2'},
				{tipo:"Plano", id:'3'}
		]);
		
		public var objetivo:ArrayCollection = new ArrayCollection(
				[ {tipo:"Locação", id:'1'},
				{tipo:"Venda", id:'2'}
		]);
			
		public var status:ArrayCollection = new ArrayCollection(
			[ {tipo:"Ativo", id:'1'},
			{tipo:"Cancelado", id:'2'},
			{tipo:"Temporariamente Cancelado", id:'3'}
		]);
		
		/* public var senhas:ArrayCollection = new ArrayCollection(
				[ {tipo:"Plansyst1", id:'1'},
				{tipo:"Conexão Remota Servidor 01", id:'2'},
				{tipo:"Conexão Remota Servidor 02", id:'3'},
				{tipo:"Conexão Remota Servidor 03", id:'4'},
				{tipo:"Internet (Proxy)", id:'5'},
				{tipo:"E-Mail", id:'6'},
				{tipo:"Plansyst2", id:'7'}
			]); */
			
			
		/* public var users:ArrayCollection;
		public var defeitos:ArrayCollection;
		public var tipodefeitos:ArrayCollection;
		public var login:ArrayCollection;
		public var ocorrencia:ArrayCollection;
		public var defeitosid:ArrayCollection;
		public var tipodefeitosid:ArrayCollection;
		public var usersid:ArrayCollection;
		public var ocorrenciaid:ArrayCollection;
		public var userschat:ArrayCollection; */
		
		private static var _instance:RepositorioDataProviders;
		public static function getInstance():RepositorioDataProviders{
			if(_instance == null){
				_instance = new RepositorioDataProviders();
			}
			return _instance;
		}


	}
}