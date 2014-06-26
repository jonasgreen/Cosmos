package com.jg.cosmos.client;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class CssName {

    public static Set<CssName> nameSet = new HashSet<CssName>();

    public static CssName FONT_SIZE = new CssName("font-size", "fontSize");

    public static CssName PADDING = new CssName("padding", "padding");
    public static CssName PADDING_TOP = new CssName("padding-top", "paddingTop");
    public static CssName PADDING_BOTTOM = new CssName("padding-bottom", "paddingBottom");
    public static CssName PADDING_RIGHT = new CssName("padding-right", "paddingRight");
    public static CssName PADDING_LEFT = new CssName("padding-left", "paddingLeft");

    private String cssName;
    private String styleName;

    public CssName(String cssName, String styleName) {
        this.cssName = cssName;
        this.styleName = styleName;
        nameSet.add(this);
    }

    public String getCssName() {
        return cssName;
    }

    public String getStyleName() {
        return styleName;
    }
}
