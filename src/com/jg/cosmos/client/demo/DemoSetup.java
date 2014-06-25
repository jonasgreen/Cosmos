package com.jg.cosmos.client.demo;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.CssClass;
import com.jg.cosmos.client.UnitProperty;

/**
 *
 */
public class DemoSetup {

    //Variables
    public static UnitProperty NORMAL_FONT_SIZE = new UnitProperty(CssName.FONT_SIZE, 12, Style.Unit.PX);



    public static CssClass DEFAULT_COMPONENT = new CssClass("defaultComponent")
            .add(NORMAL_FONT_SIZE)
            .padding(8, Style.Unit.PX);


    public static CssClass SMALL_COMPONENT = new CssClass("smallComponent")
            .extend(DEFAULT_COMPONENT)
            .add(NORMAL_FONT_SIZE.divideBy(2));


    public static CssClass LARGE_COMPONENT = new CssClass("largeComponent")
            .extend(DEFAULT_COMPONENT);







}