package ru.playjim.controller;


import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.playjim.entities.SensorDto;
import ru.playjim.services.Producer;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class Controller {
    AtomicInteger n = new AtomicInteger(0);

    private final Producer producer;
    private final MeterRegistry registry;
    public Controller(Producer producer, MeterRegistry registry) {
        this.producer = producer;
        this.registry = registry;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/sensor", produces = "application/text")
    public void addSensorCO2(@RequestBody SensorDto sensor) {
        registry.gauge("sensor.CO2",n);
        n.set(sensor.getValue());
        log.info(sensor.toString());
        producer.sendSensor(sensor);
    }
}
