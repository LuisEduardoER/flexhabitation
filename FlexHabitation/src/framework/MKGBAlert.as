package framework {
	import mx.controls.Alert;

	public class MKGBAlert extends Alert {
		
		private static var instance:MKGBAlert;

		public static const YES:int = Alert.YES;
		public static const NO:	int = Alert.NO;
		public static const OK:	int	= Alert.OK;
		
		private static function getInstance():MKGBAlert{
			if( instance == null ){
				instance = new MKGBAlert();
			}
			return instance;
		}

		public static function info(message:String, closehandler:Function=null):void{
			show(message, "Informação", Alert.OK, null, closehandler);
		}
		
		public static function alert(message:String, closehandler:Function=null):void{
			show(message, "Alerta", Alert.OK, null, closehandler);
		}
		
		public static function error(message:String, closehandler:Function=null):void{
			show(message, "Error", Alert.OK, null, closehandler);
		}
		
		public static function confirm(message:String, action:Function):void{
			Alert.noLabel = "Não";
			Alert.yesLabel = "Sim";
			show(message, "Confirme", Alert.YES | Alert.NO, null, action);
		}

		
	}
}