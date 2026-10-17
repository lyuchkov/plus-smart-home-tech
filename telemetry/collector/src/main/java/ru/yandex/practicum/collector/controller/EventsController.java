package ru.yandex.practicum.collector.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.val;
import ru.yandex.practicum.collector.model.event.HubEvent;
import ru.yandex.practicum.collector.model.event.sensor.SensorEvent;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.collector.service.CollectorService;
import ru.yandex.practicum.collector.service.HubEventCollectorService;
import ru.yandex.practicum.collector.service.SensorEventCollectorService;
import ru.yandex.practicum.kafka.telemetry.event.HubEventAvro;
import ru.yandex.practicum.kafka.telemetry.event.SensorEventAvro;
import ru.yandex.practicum.collector.kafka.KafkaClient;
import ru.yandex.practicum.collector.kafka.Topics;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsController {
    private final HubEventCollectorService hubEventCollectorService;
    private final SensorEventCollectorService sensorEventCollectorService;

    @PostMapping("/hubs")
    public void hubs(@Valid @RequestBody HubEvent hubEvent) {
        hubEventCollectorService.sendMessage(hubEvent);
    }

    @PostMapping("/sensors")
    public void sensors(@Valid @RequestBody SensorEvent sensorEvent) {
        sensorEventCollectorService.sendMessage(sensorEvent);
    }
}
