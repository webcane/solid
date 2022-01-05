package cane.brothers.solid.ocp.violation3.message;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Message {

    private String text;

    private LocalDateTime date;

    Message(String text, LocalDateTime dateTime) {
        this.text = text;
        this.date = dateTime;
    }
}
