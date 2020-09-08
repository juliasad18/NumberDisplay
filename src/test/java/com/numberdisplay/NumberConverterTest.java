package com.numberdisplay;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberConverterTest {

    @Test
    public void testNumberConverter_buildDisplayedNumber() {
        Number numberMock = new Number("0123456789");
        String[] array = NumberConverter.buildDisplayedNumber(numberMock);

        assertEquals(" ._. ... ._. ._. ... ._. ._. ._. ._. ._.", array[0], "Actual String doesn't match the expected result.");
        assertEquals(" |.| ..| ._| ._| |_| |_. |_. ..| |_| |_|", array[1], "Actual String doesn't match the expected result.");
        assertEquals(" |_| ..| |_. ._| ..| ._| |_| ..| |_| ._|", array[2], "Actual String doesn't match the expected result.");

    }

    @Test(expected = NullPointerException.class)
    public void testNumberConverter_buildDisplayedNumber_invalidInput() {
        Number numberMock = new Number("ABC");
        NumberConverter.buildDisplayedNumber(numberMock);
    }

    @Test
    public void testNumberConverter_printDisplayedNumber() {
        Number number = new Number("0123456789");
        NumberConverter.printDisplayedNumber(new String[]{"123", "456", "ABC"}, number);

        assertEquals("123", number.getArrayList().get(0), "Actual String doesn't match the expected result.");
        assertEquals("456", number.getArrayList().get(1), "Actual String doesn't match the expected result.");
        assertEquals("ABC", number.getArrayList().get(2), "Actual String doesn't match the expected result.");
    }



}
