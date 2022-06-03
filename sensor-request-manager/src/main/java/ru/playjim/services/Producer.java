package ru.playjim.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import ru.playjim.entities.SensorDto;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {
    private static final String TOPIC = "topic1";
    private final KafkaTemplate<String, SensorDto> kafkaTemplateSensor;

    public void sendSensor(SensorDto sensor) {
        log.info("Start send");
        Message<SensorDto> message = MessageBuilder
                .withPayload(sensor)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();
        kafkaTemplateSensor.send(message);
        log.info("complete send");
    }
}
