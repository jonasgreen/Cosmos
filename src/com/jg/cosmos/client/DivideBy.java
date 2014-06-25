package com.jg.cosmos.client;


/**
 *
 */
public class DivideBy extends UnitPropertyFunction {

    private double divideBy;

    public DivideBy(UnitProperty property, double divideBy) {
        super(property);
        this.divideBy = divideBy;
    }

    @Override
    public double apply() {
        return property.getValue()/divideBy;
    }
}
