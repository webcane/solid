package cane.brothers.solid.ocp.violation2.message;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class MessageAndDate extends Message {

    private LocalDateTime date;

    public MessageAndDate(String text, LocalDateTime dateTime) {
        super(text);
        this.date = dateTime;
    }
}
