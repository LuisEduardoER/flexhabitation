package br.com.cba.itemrenderers {

	import mx.controls.Label;
	import mx.controls.DataGrid;
	import mx.controls.dataGridClasses.*;
	import mx.events.FlexEvent;
	import flash.events.Event;

	public class TestItemRenderer extends CustomItemRenderer {
  		public override function styleIt() : Boolean {
   		 return data.baixado == "1";
  	}

	  	public override function styleTrue() : void {
	   	 this.opaqueBackground = 0xC1FFC1;
	  	}
		
	 	public  override function styleFalse() : void {
	   	 this.opaqueBackground = null;
	  	}
	}
}
