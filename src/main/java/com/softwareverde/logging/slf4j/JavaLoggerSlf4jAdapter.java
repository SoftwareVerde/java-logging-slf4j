package com.softwareverde.logging.slf4j;

import com.softwareverde.logging.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class JavaLoggerSlf4jAdapter implements org.slf4j.Logger {
    protected final String _loggerName;

    public JavaLoggerSlf4jAdapter(final String loggerName) {
        _loggerName = loggerName;
    }

    @Override
    public String getName() {
        return _loggerName;
    }

    @Override
    public boolean isTraceEnabled() {
        return Logger.isTraceEnabled();
    }

    @Override
    public void trace(final String message) {
        Logger.trace(message);
    }

    @Override
    public void trace(final String format, final Object object) {
        final FormattingTuple formattingTuple = MessageFormatter.format(format, object);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.trace(message, throwable);
    }

    @Override
    public void trace(final String format, final Object object1, final Object object2) {
        this.trace(format, new Object[]{ object1, object2} );
    }

    @Override
    public void trace(final String format, final Object... objects) {
        final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, objects);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.trace(message, throwable);
    }

    @Override
    public void trace(final String message, final Throwable exception) {
        Logger.trace(message, exception);
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return this.isTraceEnabled();
    }

    @Override
    public void trace(final Marker marker, final String message) {
        this.trace(message);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object object) {
        this.trace(format, object);
    }

    @Override
    public void trace(final Marker marker, final String format, final Object object1, final Object object2) {
        this.trace(format, new Object[] { object1, object2} );
    }

    @Override
    public void trace(final Marker marker, final String format, final Object... objects) {
        this.trace(format, objects);
    }

    @Override
    public void trace(final Marker marker, final String message, final Throwable exception) {
        this.trace(message, exception);
    }

    @Override
    public boolean isDebugEnabled() {
        return Logger.isDebugEnabled();
    }

    @Override
    public void debug(final String message) {
        Logger.debug(message);
    }

    @Override
    public void debug(final String format, final Object object) {
        final FormattingTuple formattingTuple = MessageFormatter.format(format, object);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.debug(message, throwable);
    }

    @Override
    public void debug(final String format, final Object object1, final Object object2) {
        this.debug(format, new Object[]{ object1, object2 });
    }

    @Override
    public void debug(final String format, final Object... objects) {
        final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, objects);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.debug(message, throwable);
    }

    @Override
    public void debug(final String message, final Throwable exception) {
        Logger.debug(message, exception);
    }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return this.isDebugEnabled();
    }

    @Override
    public void debug(final Marker marker, final String message) {
        this.debug(message);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object object) {
        this.debug(format, object);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object object1, final Object object2) {
        this.debug(format, object1, object2);
    }

    @Override
    public void debug(final Marker marker, final String format, final Object... objects) {
        this.debug(format, objects);
    }

    @Override
    public void debug(final Marker marker, final String message, final Throwable exception) {
        this.debug(message, exception);
    }

    @Override
    public boolean isInfoEnabled() {
        return Logger.isInfoEnabled();
    }

    @Override
    public void info(final String message) {
        Logger.info(message);
    }

    @Override
    public void info(final String format, final Object object) {
        final FormattingTuple formattingTuple = MessageFormatter.format(format, object);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.info(message, throwable);
    }

    @Override
    public void info(final String format, final Object object1, final Object object2) {
        this.info(format, new Object[]{ object1, object2 });
    }

    @Override
    public void info(final String format, final Object... objects) {
        final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, objects);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.info(message, throwable);
    }

    @Override
    public void info(final String message, final Throwable exception) {
        Logger.info(message, exception);
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return this.isInfoEnabled();
    }

    @Override
    public void info(final Marker marker, final String message) {
        this.info(message);
    }

    @Override
    public void info(final Marker marker, final String format, final Object object) {
        this.info(format, object);
    }

    @Override
    public void info(final Marker marker, final String format, final Object object1, final Object object2) {
        this.info(format, object1, object2);
    }

    @Override
    public void info(final Marker marker, final String format, final Object... objects) {
        this.info(format, objects);
    }

    @Override
    public void info(final Marker marker, final String message, final Throwable exception) {
        this.info(message, exception);
    }

    @Override
    public boolean isWarnEnabled() {
        return Logger.isWarnEnabled();
    }

    @Override
    public void warn(final String message) {
        Logger.warn(message);
    }

    @Override
    public void warn(final String format, final Object object) {
        final FormattingTuple formattingTuple = MessageFormatter.format(format, object);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.warn(message, throwable);
    }

    @Override
    public void warn(final String format, final Object object1, final Object object2) {
        this.warn(format, new Object[]{ object1, object2 });
    }

    @Override
    public void warn(final String format, final Object... objects) {
        final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, objects);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.warn(message, throwable);
    }

    @Override
    public void warn(final String message, final Throwable exception) {
        Logger.warn(message, exception);
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return this.isWarnEnabled();
    }

    @Override
    public void warn(final Marker marker, final String message) {
        this.warn(message);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object object) {
        this.warn(format, object);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object object1, final Object object2) {
        this.warn(format, object1, object2);
    }

    @Override
    public void warn(final Marker marker, final String format, final Object... objects) {
        this.warn(format, objects);
    }

    @Override
    public void warn(final Marker marker, final String message, final Throwable exception) {
        this.warn(message, exception);
    }

    @Override
    public boolean isErrorEnabled() {
        return Logger.isErrorEnabled();
    }

    @Override
    public void error(final String message) {
        Logger.error(message);
    }

    @Override
    public void error(final String format, final Object object) {
        final FormattingTuple formattingTuple = MessageFormatter.format(format, object);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.error(message, throwable);
    }

    @Override
    public void error(final String format, final Object object1, final Object object2) {
        this.error(format, new Object[]{ object1, object2 });
    }

    @Override
    public void error(final String format, final Object... objects) {
        final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, objects);
        final String message = formattingTuple.getMessage();
        final Throwable throwable = formattingTuple.getThrowable();
        Logger.error(message, throwable);
    }

    @Override
    public void error(final String message, final Throwable exception) {
        Logger.error(message, exception);
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return this.isErrorEnabled();
    }

    @Override
    public void error(final Marker marker, final String message) {
        this.error(message);
    }

    @Override
    public void error(final Marker marker, final String format, final Object object) {
        this.error(format, object);
    }

    @Override
    public void error(final Marker marker, final String format, final Object object1, final Object object2) {
        this.error(format, object1, object2);
    }

    @Override
    public void error(final Marker marker, final String format, final Object... objects) {
        this.error(format, objects);
    }

    @Override
    public void error(final Marker marker, final String message, final Throwable exception) {
        this.error(message, exception);
    }
}