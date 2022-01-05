package cane.brothers.solid.ocp.violation3.message;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@AllArgsConstructor
public class MessageDisplay {

    @Setter
    private Message msg;

    public void showText() {
        if(msg.getDate() != null) {
            log.info(msg.getDate() + ": " + this.msg.getText());
        } else {
            log.info(this.msg.getText());
        }
    }

    public static void main( String[] args ) {
        Message helloMessage = new Message("Hello World!", null);
        MessageDisplay display = new MessageDisplay(helloMessage);
        display.showText();

        helloMessage = new Message("Hello World!", LocalDate.parse("2022-01-01").atStartOfDay());
        display = new MessageDisplay(helloMessage);
        display.showText();
    }
}
