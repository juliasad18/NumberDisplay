package com.numberdisplay;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberInstanceTest {

    @Test
    public void testNumber_createInstance() {
        Number testNumber = new Number("0123456789");

        assertEquals("0123456789", testNumber.getNumber(), "Actual number doesn't match the expected result.");
        assertEquals(0, testNumber.getDisplayedNumber().size(), "displayedNumber list must be created and it size must be eqoal to 0.");
    }

    @Test
    public void testNumber_appendToDisplayedNumber_firstUpdate() {
        Number testNumber = new Number("0123456789");

        assertTrue(testNumber.appendToDisplayedNumber("._. ... ._. ._. ... ._. ._. ._. ._. ._.", "|.| ..| ._| ._| |_| |_. |_. ..| |_| |_|", "|_| ..| |_. ._| ..| ._| |_| ..| |_| ._|"), "String arguments have not been added.");
        assertEquals("._. ... ._. ._. ... ._. ._. ._. ._. ._.", testNumber.getDisplayedNumber().get(0), "First element is not as expected.");
        assertEquals("|.| ..| ._| ._| |_| |_. |_. ..| |_| |_|", testNumber.getDisplayedNumber().get(1), "Second element is not as expected.");
        assertEquals("|_| ..| |_. ._| ..| ._| |_| ..| |_| ._|", testNumber.getDisplayedNumber().get(2), "Third element is not as expected.");
    }

    @Test
    public void testNumber_appendToDisplayedNumber_secondUpdate() {
        Number testNumber = new Number("0123456789");
        testNumber.appendToDisplayedNumber("FirstUpdate", "FirstUpdate", "FirstUpdate");

        assertFalse(testNumber.appendToDisplayedNumber("SecondUpdate", "SecondUpdate", "SecondUpdate"), "It is not allowed to update displayedNumber list more than once.");
    }
}
