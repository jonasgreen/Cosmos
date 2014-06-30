package com.jg.cosmos.client;

import com.google.gwt.dom.client.Style;

/**
 *
 */
public class CssStyle {
    public static UnitProperty fontSize(double value, Style.Unit unit){
        return new UnitProperty(CssName.FONT_SIZE, value, unit);
    }

    public static UnitProperty fontSize(double value){
        return fontSize(value, Style.Unit.PX);
    }

    public static UnitProperty padding(double value, Style.Unit unit){
        return new UnitProperty(CssName.PADDING, value, unit);
    }

    public static UnitProperty padding(double value){
        return padding(value, Style.Unit.PX);
    }



}
