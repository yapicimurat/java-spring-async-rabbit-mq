package org.example.javaspringrabbitmqmonitoring.web.common;

import java.io.Serial;
import java.io.Serializable;

public class LogMessage implements Serializable {
    @Serial
    private static final long serialVersionUID = -2102363151741274306L;

    private LogType logType;
    private String message;

    public LogMessage(LogType logType, String message) {
        this.logType = logType;
        this.message = message;
    }

    public LogType getLogType() {
        return logType;
    }

    public String getMessage() {
        return message;
    }
}
