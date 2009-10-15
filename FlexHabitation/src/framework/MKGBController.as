package framework {
	import mx.logging.ILogger;
	import mx.messaging.messages.ErrorMessage;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.InvokeEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.remoting.mxml.Operation;

	public class MKGBController implements MKGBIController {
		
		private var _service : MKGBRemoteObject = null;
		private static var _baseController : MKGBIController;
		private static var _destination : String = null;
		
		private var _currentView:Object;
		private var _currentOperation:String;
		
		private var _operationQueue:Array  = new Array();
		private var _resultQueue:Array	   = new Array();
		
		private var _hasErrors:Boolean = false;
		
		//Utilizado quando em uma instancia da classe, serve para executar remotes com destinations diferentes.
		private var _destinationAlternativo:String = null;

		private var _singleton:Boolean = true;
		
		public function MKGBController() {
			super();
		}
		
		public static function getInstance(dest:String):MKGBIController{
			
			_destination = dest;
			if( !hasInstance() ){
				_baseController = new MKGBController();
			}
			
			return _baseController;
		}
		
		private static function hasInstance():Boolean{
			return ( _baseController != null );
		}

		public function execute(operation:String, args:Array, obj:Object=null, result:String=null, refresh:Boolean=true):MKGBRemoteObject{
			return executeLocal( operation, args, onSucess , obj, result, refresh);
		}
		
		public function executeLocal(operation:String, args:Array, eventFunction:Function, obj:Object=null, result:String=null, refresh:Boolean=true):MKGBRemoteObject	{
			//logger.info("Invocando servico..." + operation);

            _currentView = obj;
            _currentOperation = operation;
            
 			if (_destinationAlternativo == null || _singleton) {
				_destinationAlternativo = _destination;
			}

			if (refresh || MKGBArrayProvider.getInstance().findProvider(operation) == null) {
            
	            _operationQueue[operation] = obj;
	            _resultQueue[operation] = result;
	            
	            if( _service == null ){

		           	_service = MKGBRemoteObject.getService(_destinationAlternativo);
		           	if(!_service.hasEventListener(FaultEvent.FAULT)) {
	    	        	_service.addEventListener(FaultEvent.FAULT,onError);
	    	        }
	    	        if(!_service.hasEventListener(ResultEvent.RESULT)) {
	   	    	    	_service.addEventListener(ResultEvent.RESULT,eventFunction);
	   	    	    }
	   	    	    if(!_service.hasEventListener(InvokeEvent.INVOKE)) {
	       	    		_service.addEventListener(InvokeEvent.INVOKE,onInvoke);
	       	    	}
	            	
	            } else {
		           	_service = MKGBRemoteObject.getService(_destinationAlternativo);
	            }
	           
	            var op:Operation = _service.getOperation(operation) as Operation;
	            if (!op.hasEventListener(FaultEvent.FAULT)) {
	            	op.addEventListener(FaultEvent.FAULT,onError);
	            }
	            if (!op.hasEventListener(ResultEvent.RESULT)) {
	            	op.addEventListener(ResultEvent.RESULT,eventFunction);
	            }	
	            
	            if( args != null ) {
	 	            _service.getOperation(operation).arguments = args;
	            }
	            
	           	_service.getOperation(operation).send();
	           	
            } else {
//	 			logger.info("Servico " + operation + " executado com sucesso." );
	
				if( _currentView != null && operation != null && result != null){
					_currentView[result] = MKGBArrayProvider.getInstance().findProvider(operation);
				}				
				_service = MKGBRemoteObject.getService(_destinationAlternativo);
           	
            }

			return _service;	
		}
		
		public function onSucess(event:ResultEvent):void{
			
			var operation:String = event.target.name;
			var view:Object = this._operationQueue[operation];
			var result:Object = this._resultQueue[operation];
						
//			logger.info("Servico " + operation + " executado com sucesso." );

			if( view != null && operation != null && result != null){
				view[result] = event.result;
				
				if (MKGBArrayProvider.getInstance().findProvider(operation) == null) {
					var provider:MKGBProvider = new MKGBProvider();
					provider.name = operation;
					provider.provider = event.result;
					MKGBArrayProvider.getInstance().addItem(provider);
				} else {
					MKGBArrayProvider.getInstance().setProvider(operation, event.result);
					_currentView[result] = event.result;
				}
			}
						
		}
		
		public function onError(event:FaultEvent):void{
//			Alert.show(event.fault.faultString);
 			var errorMessage:ErrorMessage = event.message as ErrorMessage;	
					
			_hasErrors = true;
			MKGBAlert.error(errorMessage.rootCause.mensagem);
			//MKGBAlert.error(event.fault.faultString);
//			logger.error("Erro invocando servico..." + event.fault.faultDetail); 
		}
		
		public function onInvoke(event:InvokeEvent):void{
		}
		
		public function get destination():String {
			return _destination;
		}
		
		public function set destination(value:String):void {
			_destination = value;
		}
		
		public function get destinationAlternativo():String {
			return _destinationAlternativo;
		}
		
		public function set destinationAlternativo(value:String):void {
			_destinationAlternativo = value;
			_singleton = false;
		}

	}
}