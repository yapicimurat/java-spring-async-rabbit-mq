package org.example.fileconsumer.common;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    //QUEUE and EXCHANGE DEFINITIONS...
    public static final String FILE_LOG_QUEUE = "file_log_queue";
}
