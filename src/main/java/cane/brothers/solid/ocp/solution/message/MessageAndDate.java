package cane.brothers.solid.ocp.solution.message;

import lombok.Value;

import java.time.LocalDate;

@Value
public class MessageAndDate extends Message {

    // holds data
    private LocalDate date;

    public MessageAndDate(String text, LocalDate date) {
        super(text);
        this.date = date;
    }

    // and logic
    @Override
    public String getDisplayText() {
        return this.date + ": " + super.getText();
    }
}
