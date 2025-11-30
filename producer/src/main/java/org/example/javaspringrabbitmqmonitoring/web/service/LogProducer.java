package org.example.javaspringrabbitmqmonitoring.web.service;

import org.example.javaspringrabbitmqmonitoring.web.common.LogMessage;
import org.example.javaspringrabbitmqmonitoring.web.rabbitmq.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogProducer {
    private final AmqpTemplate amqpTemplate;

    public LogProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void send(LogMessage logMessage) {
        try {
            amqpTemplate.convertAndSend(
                    RabbitMQConfig.LOG_EXCHANGE, // 1. Exchange Adı (Fanout olduğu için Routing Key'e bakmaz)
                    "",                           // 2. Routing Key (Fanout için boş bırakılır)
                    logMessage                    // 3. Mesaj İçeriği (Payload)
            );
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
