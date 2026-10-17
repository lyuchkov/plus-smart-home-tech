package ru.yandex.practicum.collector.service;

import lombok.val;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.collector.model.event.HubEvent;
import ru.yandex.practicum.collector.model.type.DeviceType;

@Service
public class HubEventCollectorService extends CollectorService<HubEvent> {

    @Override
    public void sendMessage(HubEvent event) {
        //todo написать валидацию, сериализацю и отправку
        //DeviceType deviceType = event.getDeviceType();

        //Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.apache.avro.AvroRuntimeException: Unknown datum type ru.yandex.practicum.collector.model.event.DeviceAddedEvent: DeviceAddedEvent(type=DEVICE_ADDED)] with root cause
//        val producer = kafkaClient.getProducer();
//
//        producer.send(new ProducerRecord<>(Topics.TELEMETRY_HUBS_V1.topic, new HubEventAvro(hubEvent.getHubId(), hubEvent.getTimestamp(), hubEvent)));

    }
}
