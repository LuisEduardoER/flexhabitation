package framework {
	import mx.collections.ArrayCollection;
	
	public class MKGBArrayProvider  	{
		
		private var _providers:ArrayCollection = new ArrayCollection();
		private static var _instance:MKGBArrayProvider;
		public static function getInstance():MKGBArrayProvider {
			if (_instance == null) {
				_instance = new MKGBArrayProvider ()
			}
			
			return _instance;
		}
		
		public function findProvider(name:String): Object {
			for each (var prov:Object in _providers) {
				if (prov["name"] != null && prov["provider"] != null && prov.name == name) {
					return prov.provider;
				}
			}
			
			return null;
		}
		
		 public function addItem(item:MKGBProvider):void {
			_providers.addItem(item);
		}
		
		public function setProvider(name:String, provider:Object):void {
			for each (var prov:Object in _providers) {
				if (prov["name"] != null && prov["provider"] != null && prov.name == name) {
					prov.provider = provider;
				}
			}
		}
	}
}