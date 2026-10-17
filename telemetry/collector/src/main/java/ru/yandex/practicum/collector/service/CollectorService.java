package ru.yandex.practicum.collector.service;

import ru.yandex.practicum.collector.model.event.Event;

public abstract class CollectorService<T extends Event> {
    public abstract void sendMessage(T event);
}
