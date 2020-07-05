package com.numberdisplay;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberConverterTest {
    NumberConverter numberConverter = new NumberConverter();

    @Test
    public void displayNumberTest() {
        Number testNumber = new Number("0123456789");
        String[] actualDisplay = numberConverter.displayNumber(testNumber.getNumber());

        assertEquals(" ._. ... ._. ._. ... ._. ._. ._. ._. ._.", actualDisplay[0], "1st row is incorrect");
        assertEquals(" |.| ..| ._| ._| |_| |_. |_. ..| |_| |_|", actualDisplay[1], "2nd row is incorrect");
        assertEquals(" |_| ..| |_. ._| ..| ._| |_| ..| |_| ._|", actualDisplay[2], "3rd row is incorrect");

    }




}
