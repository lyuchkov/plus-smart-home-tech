package ru.yandex.practicum.collector.model.event.sensor;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import ru.yandex.practicum.collector.model.type.SensorEventType;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClimateSensorEvent extends SensorEvent {

    @NotBlank
    private String id;

    @NotBlank
    private String hubId;

    private Instant timestamp = Instant.now();

    @NotBlank
    private Integer temperatureC;

    @NotBlank
    private Integer humidity;

    @NotBlank
    private Integer co2Level;

    private final SensorEventType type = SensorEventType.LIGHT_SENSOR_EVENT;

}
