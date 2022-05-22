package ru.playjim.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.playjim.model.SensorCO2;
import ru.playjim.repository.SensorCO2Repository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SensorCO2Service {
    private final SensorCO2Repository sensorCO2Repository;
    public SensorCO2 createSensorCO2(SensorCO2 sensorCO2) {
        return sensorCO2Repository.save(sensorCO2);
    }

    public List<SensorCO2> getSensorCO2() {
        return sensorCO2Repository.findAll();
    }

    public void addSensorCO2(SensorCO2 co2) {
        sensorCO2Repository.save(co2);
    }
}
