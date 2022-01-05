package cane.brothers.solid.ocp.violation.message;

import lombok.Value;

@Value
public class Message {

    private final String text;

    public Message (String text) {
        this.text = text;
    }
}
