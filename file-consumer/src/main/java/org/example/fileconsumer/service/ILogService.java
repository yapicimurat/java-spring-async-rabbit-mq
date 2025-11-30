package org.example.fileconsumer.service;

import org.example.fileconsumer.common.LogType;

public interface ILogService {
    void logToFile(LogType type, String content);
}
