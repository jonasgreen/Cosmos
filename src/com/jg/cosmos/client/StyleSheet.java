package com.jg.cosmos.client;


/**
 *
 */
public class StyleSheet {

    //Set when added to CssCosmos
    private NativeStyleSheet sheet;

    private final String name;

    public StyleSheet(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    void setNativeStyleSheet(NativeStyleSheet styleSheet) {
        this.sheet = styleSheet;
    }
}
