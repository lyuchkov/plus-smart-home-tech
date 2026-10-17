package ru.yandex.practicum.collector.model.event;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.collector.model.DeviceAction;
import ru.yandex.practicum.collector.model.ScenarioCondition;
import ru.yandex.practicum.collector.model.type.HubEventType;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScenarioAddedEvent extends HubEvent {

    @NotBlank
    private List<ScenarioCondition> conditions;

    @NotBlank
    private List<DeviceAction> actions;

    @NotNull
    private final HubEventType type = HubEventType.SCENARIO_ADDED;
}
