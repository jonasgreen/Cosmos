package com.jg.cosmos.client;

import com.gargoylesoftware.htmlunit.javascript.host.css.ComputedCSSStyleDeclaration;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Cosmos implements EntryPoint{
	
	public void onModuleLoad() {

        StyleInjector.inject("div {border: 2px solid black; background-color: blue;}");

        FlowPanel p1 = new FlowPanel();
        p1.setStyleName("classOne");

        FlowPanel p2 = new FlowPanel();
        p2.setStyleName("classTwo");

        Label l = new Label("Jeg er en fisk");
        l.getElement().getStyle().setFontSize(32, Style.Unit.PX);
        p2.add(l);



        //l.getElement().getStyle().setPadding();
        StyleInjector.inject("p {border: 2px solid black; background-color: blue;}");

        p1.add(p2);

        RootLayoutPanel.get().add(p1);


  	}



}
