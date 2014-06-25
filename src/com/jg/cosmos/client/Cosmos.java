package com.jg.cosmos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.jg.cosmos.client.demo.DemoSetup;

public class Cosmos implements EntryPoint{
	
	public void onModuleLoad() {


        FlowPanel p1 = new FlowPanel();
        p1.setStyleName("classOne");

        FlowPanel p2 = new FlowPanel();
        p2.setStyleName(DemoSetup.SMALL_COMPONENT.getName());

        Label l = new Label("Jeg er en fisk");
        //l.getElement().getStyle().setFontSize(32, Style.Unit.PX);
        p2.add(l);




        p1.add(p2);

        RootLayoutPanel.get().add(p1);

        System.out.println("CSS");
        System.out.println(DemoSetup.SMALL_COMPONENT.render());
        System.out.println("Length: "+getDocumentStyleSheet());
        StyleInjector.injectAtEnd(DemoSetup.SMALL_COMPONENT.render(), true);
        System.out.println("Length: "+getDocumentStyleSheet());
        setCssClass(0,1, ".classOne { padding: 30px; background-color: blue; }");
        cssClass(0,1,"");
    }



    /*var styleSheet = document.styleSheets[idx];
    var cssRules = styleSheet.rules ? styleSheet.rules : styleSheet.cssRules;
    for (var i = 0; i < cssRules.length; ++i) {
        if(cssRules[i].selectorText == selector) return true;
    }
*/



    private static native int getDocumentStyleSheet() /*-{
       return $doc.styleSheets.length;
    }-*/;


    private static native void setCssClass(int styleSheetIndex, int cssIndex, String css) /*-{
       $doc.styleSheets[styleSheetIndex].deleteRule(0);
    }-*/;

    private static native void cssClass(int styleSheetIndex, int cssIndex, String css) /*-{
       $doc.styleSheets[styleSheetIndex].cssRules[0].style.cssText='padding: 130px; color: black;';
    }-*/;

}
