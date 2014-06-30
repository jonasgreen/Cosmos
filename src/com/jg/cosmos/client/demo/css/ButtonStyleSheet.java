package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.Selector;
import com.jg.cosmos.client.StyleSheet;

/**
 *
 */
public class ButtonStyleSheet extends StyleSheet {

    private static ButtonStyleSheet instance;
    
    public Selector normal = classSelector(".button_normal",
            fontSize(12),
            padding(10));


    public Selector small = classSelector(".button_small")
            .fontSize(10, Style.Unit.PX);

    public Selector large = classSelector(".button_large")
            .fontSize(14, Style.Unit.PX);


    public static ButtonStyleSheet get() {
        if (instance == null) {
            instance = new ButtonStyleSheet();
        }
        return instance;
    }





}
