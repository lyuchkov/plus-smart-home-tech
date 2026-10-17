package ru.yandex.practicum.collector.model.event.sensor;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.collector.model.type.SensorEventType;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemperatureSensorEvent extends SensorEvent {

    @NotBlank
    private String id;

    @NotBlank
    private String hubId;

    private Instant timestamp = Instant.now();

    @NotBlank
    private Integer temperatureC;

    @NotBlank
    private Integer temperatureF;

    private final SensorEventType type = SensorEventType.LIGHT_SENSOR_EVENT;
}
