package com.jg.cosmos.client;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class StyleSheet {

    private String name;
    private List<Selector> selectors = new ArrayList<Selector>();

    public StyleSheet(String name) {
        this.name = name;
        CssCosmos.get().createStyleSheet(this);
    }

    public String getStyleSheetName() {
        return name;
    }


    protected Selector createSelector(String name){
        //todo - validate global use of selector name
        Selector s = new Selector(this, name);
        selectors.add(s);
        return s;
    }
}
