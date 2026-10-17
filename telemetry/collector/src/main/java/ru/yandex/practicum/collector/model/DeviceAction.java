package ru.yandex.practicum.collector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.collector.model.type.ActionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceAction {

    private String sensorId;

    private ActionType type;

    private Integer value;
}
