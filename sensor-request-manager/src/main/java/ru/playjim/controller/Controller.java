package ru.playjim.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.playjim.model.SensorCO2;
import ru.playjim.services.SensorCO2Service;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class Controller {
    private final SensorCO2Service sensorCO2Service;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/CO2", produces = "application/text")
    public void addSensorCO2(@RequestBody SensorCO2 co2) {
         sensorCO2Service.addSensorCO2(co2);
    }
    @GetMapping("/CO2")
    public List<SensorCO2> getSensorCO2() {
        return sensorCO2Service.getSensorCO2();
    }
}
