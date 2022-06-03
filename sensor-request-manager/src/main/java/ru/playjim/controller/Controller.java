package ru.playjim.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.playjim.entities.SensorDto;
import ru.playjim.services.Producer;

@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {
    private final Producer producer;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/sensor", produces = "application/text")
    public void addSensorCO2(@RequestBody SensorDto sensor) {
        log.info(sensor.toString());
        producer.sendSensor(sensor);
    }
}
