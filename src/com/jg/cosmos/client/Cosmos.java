package com.jg.cosmos.client;

import com.gargoylesoftware.htmlunit.javascript.host.css.ComputedCSSStyleDeclaration;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.StyleElement;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Cosmos implements EntryPoint{


    public static int border = 1;

	public void onModuleLoad() {

        final StyleElement styleElement = getDocumentStyleSheet(0);



        FlowPanel p1 = new FlowPanel();
        p1.setStyleName("classOne");

        FlowPanel p2 = new FlowPanel();
        p2.setStyleName("classTwo");

        Label l = new Label("Jeg er en fisk");
        l.getElement().getStyle().setFontSize(32, Style.Unit.PX);
        p2.add(l);



        p1.add(p2);
        FlowPanel content = new FlowPanel();
        content.add(p1);

        Button b = new Button("click me");
        b.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                border++;
                System.out.println("css: "+styleElement.getInnerHTML());
                styleElement.setInnerHTML(".classOne {border: "+border+"px solid red; background-color: yellow;}");

            }
        });

        content.add(b);
        l = new Label("Jeg er en anden fisk");
        l.getElement().getStyle().setFontSize(12, Style.Unit.PX);
        content.add(l);
        l.setStyleName("classOne");
        RootLayoutPanel.get().add(content);


  	}


    private static native StyleElement getDocumentStyleSheet(int index) /*-{
      return $doc.styleSheets[index];
    }-*/;



}
