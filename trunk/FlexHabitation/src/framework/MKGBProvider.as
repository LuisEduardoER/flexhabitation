package framework {
	public class MKGBProvider 	{
		
		private var _provider:Object;
		private var _name:String;
		
		public function MKGBProvider() {
		}

		public function get provider():Object {
			return _provider;
		}
		
		public function set provider(value:Object): void {
			this._provider = value;
		}
		
		public function get name():String {
			return _name;
		}
		
		public function set name(value:String): void {
			this._name = value;
		}
	}
}