package ru.yandex.practicum.collector.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.collector.model.event.sensor.SensorEvent;

@Service
public class SensorEventCollectorService extends CollectorService<SensorEvent> {

    @Override
    public void sendMessage(SensorEvent event) {

        //todo написать валидацию, сериализацю и отправку
        //        val producer = kafkaClient.getProducer();
//
//        producer.send(new ProducerRecord<>(Topics.TELEMETRY_SENSORS_V1.topic, new SensorEventAvro(sensorEvent.getId(), sensorEvent.getHubId(), sensorEvent.getTimestamp(), sensorEvent)));

    }
}
