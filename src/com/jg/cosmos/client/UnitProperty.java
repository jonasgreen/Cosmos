package com.jg.cosmos.client;


import com.google.gwt.dom.client.Style;
import com.jg.cosmos.client.demo.CssName;

/**
 *
 */
public class UnitProperty extends CssProperty {

    private double value;
    private Style.Unit unit;

    public UnitProperty(CssName propertyName, double value, Style.Unit unit) {
        super(propertyName.getName());
        this.unit = unit;
        this.value = value;
    }

    public void setValue(double value) {
        boolean notifyListeners = this.value == value;
        this.value = value;
        if (notifyListeners) {
            notifyListeners();
        }
    }

    public void setUnit(Style.Unit unit) {
        boolean notifyListeners = this.unit.getType().equals(unit.getType());
        this.unit = unit;
        if (notifyListeners) {
            notifyListeners();
        }
    }


    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        render(sb);
        return sb.toString();
    }

    @Override
    public void render(StringBuilder sb) {
        sb.append(getPropertyName()).append(DELIMITER).append(value).append(unit.getType()).append(SEMICOLON);
    }

    public double getValue() {
        return value;
    }

    public Style.Unit getUnit() {
        return unit;
    }

    public UnitPropertyFunction divideBy(double divideBy){
        return new DivideBy(this, divideBy);
    }
}
