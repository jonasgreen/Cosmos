package com.jg.cosmos.api;

import com.google.gwt.dom.client.Style;

/**
 *
 */
public class StyleSheet {

    Prop primaryColor = new Prop();

    private Hover largeComponentHover = new Hover();


    public Selector LARGE_COMPONENT = new Selector(this, ".large_component")
            .padding(5, Style.Unit.PX)
            .fontSize(12, Style.Unit.PX)
            .add("font-style: 12px;")
            .add(primaryColor)
            .add(
                    new Hover(padding(10, Style.Unit.PX)));


    public Selector SMALL_COMPONENT = createSelector(".small_component",

            padding(5, Style.Unit.PX),
            fontSize(12, Style.Unit.PX))

            .hover(
                    fontSize(23, Style.Unit.PX),
                    padding(20, Style.Unit.PX)
            )
            .hover();






    public Prop padding(double d, Style.Unit unit){
        return new Prop();
    }

    public Prop fontSize(double d, Style.Unit unit){
        return new Prop();
    }



    public Selector createSelector(String asdf, Prop ... props){
        return new Selector(this, asdf);
    }

}
