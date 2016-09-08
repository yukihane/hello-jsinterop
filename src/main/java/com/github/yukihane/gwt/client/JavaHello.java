package com.github.yukihane.gwt.client;

import java.util.logging.Logger;
import jsinterop.annotations.JsType;

@JsType
public class JavaHello {

    private static final Logger LOGGER = Logger.getLogger(JavaHello.class.getName());

    public int sum(int i, int j) {
        LOGGER.info("called method sum ("+JavaHello.class.getName()+")");

        return i + j;
    }
}
