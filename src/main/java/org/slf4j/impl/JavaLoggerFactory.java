package org.slf4j.impl;

import com.softwareverde.logging.slf4j.JavaLoggerSlf4jAdapter;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.HashMap;


public class JavaLoggerFactory implements ILoggerFactory {
    protected final HashMap<String, JavaLoggerSlf4jAdapter> _loggers;

    public JavaLoggerFactory() {
        _loggers = new HashMap<String, JavaLoggerSlf4jAdapter>();
    }

    @Override
    public Logger getLogger(final String loggerName) {
        synchronized (_loggers) {
            final JavaLoggerSlf4jAdapter existingLogger = _loggers.get(loggerName);
            if (existingLogger != null) {
                return existingLogger;
            }

            final JavaLoggerSlf4jAdapter logger = new JavaLoggerSlf4jAdapter(loggerName);
            _loggers.put(loggerName, logger);
            return logger;
        }
    }
}