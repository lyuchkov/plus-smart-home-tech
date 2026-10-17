package ru.yandex.practicum.collector.model.event;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
public abstract class Event {

    @NotBlank
    private String hubId;


    private Instant timestamp = Instant.now();

    @NotBlank
    private String id;
}
