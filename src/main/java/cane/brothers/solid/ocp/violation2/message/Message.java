package cane.brothers.solid.ocp.violation2.message;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
@AllArgsConstructor
public class Message {

    private String text;
}
