package framework {

	import flash.events.IEventDispatcher;
	
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.InvokeEvent;
	import mx.rpc.events.ResultEvent;

	public interface MKGBIController {

		function execute( operation:String, args:Array, obj:Object = null, result:String = null, refresh:Boolean=true ):MKGBRemoteObject;
		function executeLocal( operation:String, args:Array, eventFunction:Function, obj:Object = null, result:String = null, refresh:Boolean=true ):MKGBRemoteObject;
		function onSucess( event:ResultEvent ):void;
		function onError( event:FaultEvent ):void;
		function onInvoke( event:InvokeEvent ):void;
		
	}
}