package com.jg.cosmos.client.demo.css;

import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.Selector;
import com.jg.cosmos.client.StyleSheet;

/**
 *
 */
public class ComponentStyleSheet extends StyleSheet {

    public Selector default_component = createSelector(".defaultComponent")
            .fontSize(12, Style.Unit.PX)
            .backgroundColor("yellow")
            .padding(20, Style.Unit.PX);

    public Selector SMALL_COMPONENT = createSelector(".smallComponent")
            .fontSize(10, Style.Unit.PX);

    public Selector LARGE_COMPONENT = createSelector(".largeComponent")
            .add(Variable.LARGE_FONT_SIZE);





    public ComponentStyleSheet() {
        super("ComponentSheet");
    }


}
