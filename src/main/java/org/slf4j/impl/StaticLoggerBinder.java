package org.slf4j.impl;


import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;


public class StaticLoggerBinder implements LoggerFactoryBinder {
    protected static final StaticLoggerBinder INSTANCE = new StaticLoggerBinder();

    public static StaticLoggerBinder getSingleton() { return INSTANCE; }

    /**
     * Declare the version of the SLF4J API this implementation is compiled against.
     */
    // To avoid constant folding by the compiler, this field must not be final.
    public static String REQUESTED_API_VERSION = "1.7.30";

    protected static final String LOGGER_FACTORY_CLASS_STRING = JavaLoggerFactory.class.getName();

    protected final ILoggerFactory _loggerFactory;

    protected StaticLoggerBinder() {
        _loggerFactory = new JavaLoggerFactory();
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return _loggerFactory;
    }

    @Override
    public String getLoggerFactoryClassStr() {
        return LOGGER_FACTORY_CLASS_STRING;
    }
}