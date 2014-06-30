package com.jg.cosmos.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Group {

    private List<CssProperty> properties;

    public Group(CssProperty ... cssProperties) {
        properties = Arrays.asList(cssProperties);
    }
}
