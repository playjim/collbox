package ru.playjim.processor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ru.playjim.processor.entities.SensorDto;

@Service
@RequiredArgsConstructor
@Slf4j
public class SensorService {
    @Value("${appl.groupid}")
    private String groupId;

    @KafkaListener(topics = "topic1", containerFactory = "kafkaListenerContainerFactorySensor")
    public void listenGroupTopic1(@Payload SensorDto sensorDto, @Headers MessageHeaders headers) {
        System.out.println("received data in Consumer One =" + sensorDto.toString());
    }
}
