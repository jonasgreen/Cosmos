package com.jg.cosmos.client.demo;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.jg.cosmos.client.CssCosmos;
import com.jg.cosmos.client.demo.css.ButtonStyleSheet;
import com.jg.cosmos.client.demo.css.PageStyleSheet;

/**
 *
 */
public class Demo {

    public void run(){

        CssCosmos.get().add(PageStyleSheet.get());
        CssCosmos.get().add(ButtonStyleSheet.get());


        CssCosmos.get().loadStyleSheets();


        FlowPanel f = new FlowPanel();
        f.removeFromParent();


        System.out.println("header");


    }
}
