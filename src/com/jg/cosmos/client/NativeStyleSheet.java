package com.jg.cosmos.client;


import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 */
public class NativeStyleSheet extends JavaScriptObject{

    protected NativeStyleSheet() {
    }

    public final native void addSelector(String rule) /*-{
        this.insertRule(rule, 0);
    }-*/;




}
