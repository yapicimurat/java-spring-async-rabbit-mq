package org.example.fileconsumer;

import org.example.fileconsumer.common.LogType;
import org.example.fileconsumer.service.ILogService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class DefaultLogService implements ILogService {
    private static final String DESTINATION_FILE_NAME = "logs.txt";

    @Override
    public final synchronized void logToFile(LogType type, String content) {
        Path filePath = Path.of(DESTINATION_FILE_NAME);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String timestamp = LocalDateTime.now().format(formatter);
        String logText = "[" + timestamp + "] " + content + System.lineSeparator();
        try {
            Files.writeString(
                    filePath,
                    logText
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
