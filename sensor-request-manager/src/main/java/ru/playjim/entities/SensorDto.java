package ru.playjim.entities;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Value
@Builder
@Jacksonized
@Setter
public class SensorDto {
    Long id;
    Integer value;
    Date date;
    String type;
}
