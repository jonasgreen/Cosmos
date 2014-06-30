package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.NativeStyleSheet;
import com.jg.cosmos.client.Selector;
import com.jg.cosmos.client.StyleSheet;

/**
 *
 */
public class ComponentStyleSheet extends StyleSheet {
    public ComponentStyleSheet() {
        super("components");
    }

    public Selector normal = createSelector(".component_normal")
            .fontSize(12, Style.Unit.PX)
            .padding(20, Style.Unit.PX);

    public Selector small = createSelector(".component_small")
            .add(normal)
            .fontSize(10, Style.Unit.PX);

    public Selector large = createSelector(".component_large")
            .add(normal)
            .
            .add(Variable.LARGE_FONT_SIZE);





}
