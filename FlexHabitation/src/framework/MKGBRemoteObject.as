package framework {
	
	import mx.rpc.remoting.mxml.RemoteObject;

	public final class MKGBRemoteObject extends RemoteObject {

		private var _controllerName:String;
		private var _viewCalling:Object;
		private static var _service : MKGBRemoteObject = null;
		private static var _loadedServices:Array = new Array();

		public static function getService( serviceName : String ): MKGBRemoteObject{
			
			if( _service == null || !hasService(serviceName) ){
				_service = new MKGBRemoteObject();
				_service.destination = serviceName;
				_service.showBusyCursor = true;
//				_loadedServices[ serviceName ] = _service ;
			}else{
				_service = _loadedServices[ serviceName ];
			}
			
			return _service;
		}
		
		private static function hasService( serviceName:String ):Boolean{
			return ( _loadedServices[ serviceName ] != null );
		}
		
	}
}