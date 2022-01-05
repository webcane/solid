package cane.brothers.solid.ocp.violation.message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class MessageDisplay {

    private final Message msg;

    public void showText() {
        log.info(this.msg.getText());
        // when will be required to display not only text, 2 classes will be changed
    }
}
