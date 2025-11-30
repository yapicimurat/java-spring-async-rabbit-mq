package org.example.javaspringrabbitmqmonitoring.web.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String FILE_LOG_QUEUE = "file_log_queue";
    public static final String DB_LOG_QUEUE = "db_log_queue";
    public static final String LOG_EXCHANGE = "log_fanout_exchange";

    @Bean
    public Queue dbLogQueue() {
        return new Queue(DB_LOG_QUEUE, true);
    }

    @Bean
    public Queue fileLogQueue() {
        return new Queue(FILE_LOG_QUEUE, true);
    }

    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange(LOG_EXCHANGE);
    }

    @Bean
    public Binding dbBinding(Queue dbLogQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(dbLogQueue).to(exchange);
    }

    @Bean
    public Binding fileBinding(Queue fileLogQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(fileLogQueue).to(exchange);
    }
}
