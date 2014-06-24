package com.jg.cosmos.api;

import com.google.gwt.dom.client.Style;

/**
 *
 */
public class Selector {

    public Selector(StyleSheet sheet, String selectorNames) {
    }

    public Selector padding(double d, Style.Unit unit){
        return this;
    }

    public Selector(StyleSheet sheet, String selectorNames, Prop[] props) {
    }


    public Selector fontSize(double d, Style.Unit unit){
        return this;
    }

    public Selector add(Hover h){
        return this;
    }

    public Selector hover(Prop ... props){
        return this;
    }
}
