package br.com.cba.itemrenderers{

import mx.controls.Label;
import mx.controls.DataGrid;
import mx.controls.dataGridClasses.*;
import mx.events.FlexEvent;
import flash.events.Event;

public class CustomItemRenderer extends Label {

public function CustomItemRenderer () {
  //listen for render events
  addEventListener(Event.RENDER, renderListener);
}

public function styleIt() : Boolean {
  return false;
}

public function styleTrue() : void {
}

public  function styleFalse() : void {
}

protected function renderListener(event:Event) : void {
  if (listData != null) {
      var grid:DataGrid = DataGrid(DataGridListData(listData).owner);
      if (!grid.isItemHighlighted(data) && grid.selectedItem != data) {
          if (styleIt()) {
              styleTrue();
          } else {
              styleFalse();
          }
      } else {
          styleFalse();
      }
  }
}
}
}