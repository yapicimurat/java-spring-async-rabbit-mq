package org.example.fileconsumer;

import org.example.fileconsumer.common.LogMessage;
import org.example.fileconsumer.common.RabbitMQConfig;
import org.example.fileconsumer.service.ILogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LogConsumer {
    private final ILogService logService;

    public LogConsumer(ILogService logService) {
        this.logService = logService;
    }

    @RabbitListener(queues = RabbitMQConfig.FILE_LOG_QUEUE)
    public void receiveLog(LogMessage message) {
        try {
            logService.logToFile(message.getLogType(), message.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
