package ru.playjim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.playjim.model.SensorCO2;

import java.util.List;

@Repository
public interface SensorCO2Repository extends JpaRepository<SensorCO2,Long> {
}
