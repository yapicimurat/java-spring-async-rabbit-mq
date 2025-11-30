package org.example.javaspringrabbitmqmonitoring.rabbitmq.producer;

import org.example.javaspringrabbitmqmonitoring.rabbitmq.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogProducer {
    private final AmqpTemplate amqpTemplate;

    public LogProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendLogMessage(String logMessage) {
        System.out.println("Log Üretildi: " + logMessage);
        amqpTemplate.convertAndSend(RabbitMQConfig.LOG_EXCHANGE, null, logMessage);
    }
}
