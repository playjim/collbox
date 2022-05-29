package ru.playjim.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.playjim.model.Sensor;
import ru.playjim.services.Producer;

@RestController
public class Controller {
    private final Producer producer;

    public Controller(Producer producer) {
        this.producer = producer;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/sensor", produces = "application/text")
    public void addSensorCO2(@RequestBody Sensor sensor) {
        producer.sendSensor("topic1",sensor);
    }
}
