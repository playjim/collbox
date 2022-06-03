package ru.playjim.processor.entities;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Value
@Builder
@Jacksonized
public class SensorDto {
    Long id;
    Integer value;
    Date date;
    String type;
}
