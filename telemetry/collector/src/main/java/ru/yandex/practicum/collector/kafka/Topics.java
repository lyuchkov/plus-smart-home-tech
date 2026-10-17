package ru.yandex.practicum.collector.kafka;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Topics {
        TELEMETRY_HUBS_V1("telemetry.hubs.v1"),
        TELEMETRY_SENSORS_V1("telemetry.sensors.v1"),
        ;

        public final String topic;
}
