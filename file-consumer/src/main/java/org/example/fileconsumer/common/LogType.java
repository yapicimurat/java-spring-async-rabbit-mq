package org.example.fileconsumer.common;

public enum LogType {
    USER_LOGIN("LOGIN:"),
    USER_LOGOUT("LOGOUT:"),
    ERROR("ERROR:"),
    WARNING("WARNING:");

    public final String prefix;

    LogType(String prefix) {
        this.prefix = prefix;
    }
}
