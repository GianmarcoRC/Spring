package es.gianmarco.ejemplos.primeraweb.model;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Event {
    private int eventId;
    private String title;
    private String description;
    private LocalDateTime start;
    private LocalDateTime end;


    public Event(int i, String s) {
    }
}
