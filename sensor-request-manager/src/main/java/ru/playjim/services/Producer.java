package ru.playjim.services;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import ru.playjim.model.Sensor;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {
    private final KafkaTemplate<String, Sensor> kafkaTemplateSensor;
    public void sendSensor(String topic,Sensor sensor) {
        log.info("Start send");
        kafkaTemplateSensor.send(topic,sensor);
        log.info("complete send");
    }
}
