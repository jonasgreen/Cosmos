package com.jg.cosmos.client;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class CssProperty implements CssItem {

    public static final String DELIMITER = ": ";
    public static final String SEMICOLON = ";";

    private static long idCounter = 0;


    private long id = idCounter++;
    private final String propertyName;

    private List<CssPropertyListener> listeners = new ArrayList<CssPropertyListener>();



    protected CssProperty(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void appendProperties(List<CssProperty> properties){
        properties.add(this);
    }

    public void addListener(CssPropertyListener l){
        listeners.add(l);
    }

    public void removeListener(CssPropertyListener l){
        listeners.remove(l);
    }


    protected void notifyListeners() {
        for (CssPropertyListener l : listeners) {
            l.onValueChange(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CssProperty that = (CssProperty) o;

        if (id != that.id) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
