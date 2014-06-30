package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.NativeStyleSheet;
import com.jg.cosmos.client.Selector;
import com.jg.cosmos.client.StyleSheet;

/**
 *
 */
public class PageStyleSheet extends StyleSheet{

    public Selector default_page = create(".defaultPage")
            .padding(0, Style.Unit.PX);




    public PageStyleSheet() {
        super("PageSheet");
    }
}
