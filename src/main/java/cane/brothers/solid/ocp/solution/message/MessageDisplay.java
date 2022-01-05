package cane.brothers.solid.ocp.solution.message;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class MessageDisplay {

    private final Message msg;

    public void showText() {
        log.info(this.msg.getDisplayText());
    }
}
