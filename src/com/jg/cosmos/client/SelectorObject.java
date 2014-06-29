package com.jg.cosmos.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SelectorObject implements CssItem, CssPropertyListener {

    private Element element;
    private NativeStyleSheet nativeStyleSheet;
    private final String className;
    private List<CssItem> items = new ArrayList<CssItem>();

    public SelectorObject(String className){
        this.className = className;
    }

    public SelectorObject fontSize(double value, Style.Unit unit){
        createUnitProperty(CssName.FONT_SIZE, value, unit);
        return this;
    }

    public SelectorObject extend(SelectorObject toExtend){
        for (CssProperty p : toExtend.getAllProperties()) {
            items.add(p);
        }
        return this;
    }


    private UnitProperty createUnitProperty(CssName propertyName, double value, Style.Unit unit) {
        UnitProperty p = new UnitProperty(propertyName, value, unit);
        add(p);
        return p;
    }

    public SelectorObject add(CssProperty p){
        p.addListener(this);
        items.add(p);
        return this;
    }

    public SelectorObject add(UnitPropertyFunction f){
        f.getProperty().addListener(this);
        items.add(f);
        return this;
    }


    private static native Element nCreateSelector(String name) /*-{
        var cssNode = document.createElement('CSSStyle');
        cssNode.type = 'text/css';
        cssNode.rel = 'stylesheet';
        cssNode.media = 'screen';
        cssNode.title = name;
        return cssNode;
    }-*/;


    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        render(sb);
        return sb.toString();
    }

    @Override
    public void render(StringBuilder sb) {
        sb.append(".").append(className).append("{").append("    /* made by Cosmos */\n");

        for (CssProperty p : getAllProperties()) {
            sb.append("    ");
            p.render(sb);
            sb.append("\n");
        }

        sb.append("}\n\n");
    }

    public List<CssProperty> getAllProperties(){
        List<CssProperty> props = new ArrayList<CssProperty>();
        appendProperties(props);
        return props;
    }

    @Override
    public void appendProperties(List<CssProperty> properties) {
        for (CssItem item : items) {
            item.appendProperties(properties);
        }
    }

    @Override
    public void onValueChange(CssProperty value) {

    }

    public String getName() {
        return className;
    }

    public NativeStyleSheet getNativeStyleSheet() {
        return nativeStyleSheet;
    }

// UTILITY METHODS FOR ADDING DIFFERENT PROPERTIES

    public SelectorObject padding(double value, Style.Unit unit){
        createUnitProperty(CssName.PADDING, value, unit);
        return this;
    }

    public SelectorObject padding(double topAndBottom, double rightAndLeft, Style.Unit unit){
        createUnitProperty(CssName.PADDING_TOP, topAndBottom, unit);
        createUnitProperty(CssName.PADDING_BOTTOM, topAndBottom, unit);
        createUnitProperty(CssName.PADDING_RIGHT, rightAndLeft, unit);
        createUnitProperty(CssName.PADDING_LEFT, rightAndLeft, unit);
        return this;
    }

    public SelectorObject padding(double top, double rightAndLeft, double bottom, Style.Unit unit){
        createUnitProperty(CssName.PADDING_TOP, top, unit);
        createUnitProperty(CssName.PADDING_RIGHT, rightAndLeft, unit);
        createUnitProperty(CssName.PADDING_LEFT, rightAndLeft, unit);
        createUnitProperty(CssName.PADDING_BOTTOM, bottom, unit);
        return this;
    }

    public SelectorObject padding(double top, double right, double bottom, double left, Style.Unit unit){
        createUnitProperty(CssName.PADDING_TOP, top, unit);
        createUnitProperty(CssName.PADDING_RIGHT, right, unit);
        createUnitProperty(CssName.PADDING_BOTTOM, bottom, unit);
        createUnitProperty(CssName.PADDING_LEFT, left, unit);
        return this;
    }

}
