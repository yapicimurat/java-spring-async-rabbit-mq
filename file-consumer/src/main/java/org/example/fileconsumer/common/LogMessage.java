package org.example.fileconsumer.common;

public class LogMessage {
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
