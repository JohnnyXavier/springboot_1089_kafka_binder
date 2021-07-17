package com.kbinder.kafka_binder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

/**
 * Kafka Stream config bean
 *
 * @author Johnny Xavier
 */
@Configuration
public class KafkaListenerConfig
{
    /**
     * Bean used by springCloud to consume kafka messages.
     *
     * @return the message  consumer
     */
    @Bean
    public Consumer<Message<String>> messageReceived( )
    {
        return Message::getPayload;
    }
}
