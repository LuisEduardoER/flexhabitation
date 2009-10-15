package br.com.jfrootmaster.dataprovider{
	
	import mx.collections.ArrayCollection;
	
	
	[Bindable]
	public class RepositorioDataProviders{
		
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