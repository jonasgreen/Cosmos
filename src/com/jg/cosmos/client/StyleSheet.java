package com.jg.cosmos.client;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class StyleSheet extends CssStyle{


    //Set when added to CssCosmos - indicates stylesheet is in the dom
    private NativeStyleSheet nativeSheet;

    private List<Selector> selectors = new ArrayList<Selector>();



    public StyleSheet() {
    }



    void setNativeStyleSheet(NativeStyleSheet styleSheet) {
        this.nativeSheet = styleSheet;
    }

    protected Selector classSelector(String name, CssProperty ... properties){
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
