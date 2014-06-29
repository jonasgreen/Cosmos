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


    public <T extends StyleSheet> T add(T sheet){
      if(styleSheets.get(sheet.getName()) != null){
            throw new RuntimeException("A stylesheet with name: "+sheet.getName() + " already exist.");
        }
        styleSheets.put(sheet.getName(), sheet);
        sheet.setNativeStyleSheet(createNativeStyleSheet(sheet.getName()));
        return sheet;
    }


    static native NativeStyleSheet createNativeStyleSheet(String name) /*-{
        var cssNode = $doc.createElement('style');
        cssNode.type = 'text/css';
        cssNode.rel = 'stylesheet';
        cssNode.media = 'screen';
        cssNode.title = name;
        $doc.getElementsByTagName("head")[0].appendChild(cssNode);
        return $doc.styleSheets[$doc.styleSheets.length-1];
    }-*/;













}
