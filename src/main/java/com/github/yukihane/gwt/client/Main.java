package com.github.yukihane.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import java.util.logging.Logger;

public class Main implements EntryPoint {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    @Override
    public void onModuleLoad() {
        LOGGER.fine("called onModuleLoad()");
    }
}
