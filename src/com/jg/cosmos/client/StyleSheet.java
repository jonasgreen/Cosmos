package com.jg.cosmos.client;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class StyleSheet {




    //Set when added to CssCosmos - indicates stylesheet is in the dom
    private NativeStyleSheet nativeSheet;

    private List<Selector> selectors = new ArrayList<Selector>();


    private final String name;

    public StyleSheet(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    void setNativeStyleSheet(NativeStyleSheet styleSheet) {
        this.nativeSheet = styleSheet;
    }

    protected Selector createSelector(String name){
        Selector sel = new Selector(name);
        selectors.add(sel);

        if(nativeSheet != null){
            bind(sel);
        }

        return sel;
    }

    private void bind(Selector sel) {

    }

}
