package cane.brothers.solid.ocp.violation.message;

import lombok.extern.slf4j.Slf4j;

/**
 * Open-Closed Principle
 */
@Slf4j
public class OrigApp {
    public static void main( String[] args ) {
        Message helloMessage = new Message("Hello World!");
        MessageDisplay display = new MessageDisplay(helloMessage);
        display.showText();
    }
}
