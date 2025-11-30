package org.example.javaspringrabbitmqmonitoring.web.service;

import org.example.javaspringrabbitmqmonitoring.web.common.LogType;

public interface LogService {
    void logToFile(LogType type, String content);
    void logToDB(LogType type, String content);
}
