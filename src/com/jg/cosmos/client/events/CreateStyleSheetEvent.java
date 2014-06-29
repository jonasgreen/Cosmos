package com.jg.cosmos.client.events;

import com.jg.cosmos.client.CssCosmos;

/**
 *
 */
public class CreateStyleSheetEvent extends StyleSheetEvent{

    public CreateStyleSheetEvent(String styleSheetName) {
        super(styleSheetName);
    }

    @Override
    public void execute() {
        CssCosmos.get().createStyleSheet(styleSheetName);
    }

    @Override
    public void undo() {
        CssCosmos.get().deleteStyleSheet(styleSheetName);
    }
}
