package ru.yandex.practicum.collector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.collector.model.type.ConditionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScenarioCondition {

    private String sensorId;

    private ConditionType type;

    private ConditionOperation operation;

    private Integer value;
}
