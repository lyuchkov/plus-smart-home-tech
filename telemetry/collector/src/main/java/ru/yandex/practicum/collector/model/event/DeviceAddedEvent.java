package ru.yandex.practicum.collector.model.event;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.yandex.practicum.collector.model.type.HubEventType;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceAddedEvent extends HubEvent {

    @NotNull
    private final HubEventType type = HubEventType.DEVICE_ADDED;
}
