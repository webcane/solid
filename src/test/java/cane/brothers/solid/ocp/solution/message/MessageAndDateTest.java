package cane.brothers.solid.ocp.solution.message;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MessageAndDateTest {

    @Test
    void test_getDisplayText() {
        Message testMessage = new MessageAndDate("Important message!", LocalDate.parse("2022-01-01"));
        assertEquals("2022-01-01: Important message!", testMessage.getDisplayText());
    }
}