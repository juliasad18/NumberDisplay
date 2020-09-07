package com.numberdisplay;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberInstanceTest {

    @Test
    public void testNumber_createInstance() {
        Number testNumber = new Number("0123456789");

        assertEquals("0123456789", testNumber.getNumber(), "Actual number doesn't match the expected result.");
    }

}
