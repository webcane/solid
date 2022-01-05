package cane.brothers.solid.ocp.violation2.message;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@ToString
@AllArgsConstructor
public class MessageDisplay {

    @Setter
    private Message msg;

    public void showText() {
        if(msg instanceof MessageAndDate) {
            MessageAndDate msgDate = (MessageAndDate) msg;
            log.info(msgDate.getDate() + ": " + this.msg.getText());
        } else {
            log.info(this.msg.getText());
        }
    }

    public static void main( String[] args ) {
        MessageAndDate helloMessage = new MessageAndDate("Hello World!", LocalDate.parse("2022-01-01").atStartOfDay());
        MessageDisplay display = new MessageDisplay(helloMessage);
        display.showText();
    }
}
