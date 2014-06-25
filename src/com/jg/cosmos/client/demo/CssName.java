package com.jg.cosmos.client.demo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class CssName {

    public static Set<CssName> nameSet = new HashSet<CssName>();

    public static CssName FONT_SIZE = new CssName("font-size");

    public static CssName PADDING = new CssName("padding");
    public static CssName PADDING_TOP = new CssName("padding-top");
    public static CssName PADDING_BOTTOM = new CssName("padding-bottom");
    public static CssName PADDING_RIGHT = new CssName("padding-right");
    public static CssName PADDING_LEFT = new CssName("padding-left");

    private String name;

    public CssName(String name) {
        this.name = name;
        nameSet.add(this);
    }

    public String getName() {
        return name;
    }
}
