package com.numberdisplay;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberConverterTest {

    @Test
    public void testNumberConverter_convertNumber_validInput() {
        NumberMock numberMock = new NumberMock("0123456789");
        NumberConverter.convertNumber(numberMock);

        assertEquals(" ._. ... ._. ._. ... ._. ._. ._. ._. ._.", numberMock.getFirstRow(), "Actual String doesn't match the expected result.");
        assertEquals(" |.| ..| ._| ._| |_| |_. |_. ..| |_| |_|", numberMock.getSecondRow(), "Actual String doesn't match the expected result.");
        assertEquals(" |_| ..| |_. ._| ..| ._| |_| ..| |_| ._|", numberMock.getThirdRow(), "Actual String doesn't match the expected result.");
    }

    @Test(expected = NullPointerException.class)
    public void testNumberConverter_convertNumber_invalidInput() {
        NumberMock numberMock = new NumberMock("ABC");
        NumberConverter.convertNumber(numberMock);
    }

}
