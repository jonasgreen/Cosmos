package com.jg.cosmos.client;

import java.util.List;

/**
 *
 */
public interface CssItem {

    public String render();
    public void render(StringBuilder sb);
    public void appendProperties(List<CssProperty> properties);
}
