package com.jg.cosmos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.jg.cosmos.client.demo.Css;
import com.jg.cosmos.client.demo.Demo;
import com.jg.cosmos.client.demo.css.PageStyleSheet;

public class Cosmos implements EntryPoint{
	
	public void onModuleLoad() {
        FlowPanel content = new FlowPanel();


        FlowPanel f = new FlowPanel();
        f.setHeight("400px");
        f.setStyleName("classOne");



        final NativeStyleSheet s = NativeStyleSheet.createStyleSheet("sheet");

        Button b = new Button("press");
        b.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                s.addSelector(".shit{ }");


                //p.add();
            }
        });



        content.add(f);
        content.add(b);
        RootLayoutPanel.get().add(content);



    }




    private static native int getDocumentStyleSheet() /*-{
       return $doc.styleSheets.length;
    }-*/;


    private static native void setCssClass(int styleSheetIndex, int cssIndex, String css) /*-{
       $doc.styleSheets[styleSheetIndex].deleteRule(0);
    }-*/;

    private static native void cssClass(int styleSheetIndex, int cssIndex, String css) /*-{
       $doc.styleSheets[styleSheetIndex].cssRules[0].style.cssText='padding: 130px; color: black;';
    }-*/;


    private static native String getPropertyValue(int styleSheetIndex, String name) /*-{
       return $doc.styleSheets[styleSheetIndex].cssRules[0].style[name];
    }-*/;

}
