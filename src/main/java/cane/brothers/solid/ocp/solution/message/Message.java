package cane.brothers.solid.ocp.solution.message;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
@AllArgsConstructor
public class Message implements IDisplayable {

    private final String text;

    @Override
    public String getDisplayText() {
        return text;
    }
}
