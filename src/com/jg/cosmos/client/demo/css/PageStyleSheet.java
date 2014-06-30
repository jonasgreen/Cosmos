package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.Group;
import com.jg.cosmos.client.Selector;
import com.jg.cosmos.client.StyleSheet;
import com.jg.cosmos.client.Variable;

/**
 *
 */
public class PageStyleSheet extends StyleSheet{

    private static PageStyleSheet instance;


    //GROUPS
    public static Group typicalPage = new Group(fontSize(12), padding(2));


    //VARIABLES
    public static Variable fontSize = new Variable(fontSize(12));


    //CLASSES
    public Selector page_normal = classSelector(".pageNormal",
            padding(20),
            fontSize(10, Style.Unit.PX));


    public static PageStyleSheet get() {
        if (instance == null) {
            instance = new PageStyleSheet();
        }
        return instance;
    }


}
