package cane.brothers.solid.ocp.solution.message;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

class MessageDisplayTest {

    private PrintStream realSysOut;
    private ByteArrayOutputStream sysOutBuffer;

    @BeforeEach
    void init() {
        realSysOut = System.out;
        sysOutBuffer = new ByteArrayOutputStream();
        System.setErr(new PrintStream(sysOutBuffer));
    }

    @Test
    void test_showText() {
        Message testMessage = new MessageAndDate("Important message!", LocalDate.parse("2022-01-01"));
        MessageDisplay display = new MessageDisplay(testMessage);

        display.showText();

        // Assert that a given string was written in the meantime to System.err
        assertThat(new String(sysOutBuffer.toByteArray()), containsString("2022-01-01: Important message!"));
    }

    @AfterEach
    void tearDown() {
        // Don't forget to bring back the real System.err at the end of the test
        System.setOut(realSysOut);
    }

}