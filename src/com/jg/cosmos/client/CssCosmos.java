package com.jg.cosmos.client;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class CssCosmos {

    private static CssCosmos instance;

    private Map<String, StyleSheet> styleSheets = new HashMap<String, StyleSheet>();


    public static CssCosmos get() {
        if (instance == null) {
            instance = new CssCosmos();
        }
        return instance;
    }


    void createStyleSheet(StyleSheet sheet){
        if(styleSheets.get(sheet.getStyleSheetName()) != null){
            throw new RuntimeException("A stylesheet with name: "+sheet.getStyleSheetName() + " already exist.");
        }
        nCreateStyleSheet(sheet.getStyleSheetName());

        styleSheets.put(sheet.getStyleSheetName(), sheet);
    }

    private static native void nCreateStyleSheet(String name) /*-{
        var cssNode = document.createElement('style');
        cssNode.type = 'text/css';
        cssNode.rel = 'stylesheet';
        cssNode.media = 'screen';
        cssNode.title = name;

        $doc.getElementsByTagName("head")[0].appendChild(cssNode);
    }-*/;

}
