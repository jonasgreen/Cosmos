package com.jg.cosmos.client.events;

/**
 *
 */
public abstract class StyleSheetEvent {

    protected String styleSheetName;

    protected StyleSheetEvent(String styleSheetName) {
        this.styleSheetName = styleSheetName;
    }

    public abstract void execute();

    public abstract void undo();


}
