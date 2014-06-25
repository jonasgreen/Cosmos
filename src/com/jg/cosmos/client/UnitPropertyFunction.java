package com.jg.cosmos.client;


import java.util.List;

/**
 *
 */
public abstract class UnitPropertyFunction extends CssFunction{

    protected UnitProperty property;

    public UnitPropertyFunction(UnitProperty property) {
        this.property = property;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        render(sb);
        return sb.toString();
    }

    @Override
    public void render(StringBuilder sb) {
        sb.append(property.getPropertyName()).append(CssProperty.DELIMITER).append(apply()).append(property.getUnit().getType()).append(CssProperty.SEMICOLON);
    }

    @Override
    public void appendProperties(List<CssProperty> properties) {
        properties.add(property);
    }

    public abstract double apply();

    public UnitProperty getProperty() {
        return property;
    }
}
