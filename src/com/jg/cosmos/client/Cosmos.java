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
        StyleInjector.inject(DemoSetup.SMALL_COMPONENT.render());

  	}



}
