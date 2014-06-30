package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.*;

/**
 *
 */
public class PageStyleSheet extends StyleSheet{

    private static PageStyleSheet instance;


    //GROUPS
    public static Group typicalPage = new Group(
            fontSize(12),
            padding(2));


    //VARIABLES
    public static UnitProperty smallFontSize = fontSize(10);

    //VARIABLES with names - to use with cosmos editor.
    public static Variable defaultFontSize = new Variable("defaultFontSize", fontSize(12));


    //CLASSES
    public Selector page_normal = classSelector(".pageNormal",
            padding(20),
            smallFontSize);


    public static PageStyleSheet get() {
        if (instance == null) {
            instance = new PageStyleSheet();
        }
        return instance;
    }


}
