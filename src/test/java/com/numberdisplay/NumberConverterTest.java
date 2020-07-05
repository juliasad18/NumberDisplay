package com.numberdisplay;


import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberConverterTest {
    NumberConverter numberConverter = new NumberConverter();


    @Test
    public void displayNumberTest() {
        Number testNumber = new Number("123");
        String[] actualDisplay = numberConverter.displayNumber(testNumber.getNumber());

        assertEquals(" ... ._. ._.", Array.get(actualDisplay, 0), "1st row is incorrect");
        assertEquals(" ..| ._| ._|", Array.get(actualDisplay, 1), "2nd row is incorrect");
        assertEquals(" ..| |_. ._|", Array.get(actualDisplay, 2), "3rd row is incorrect");


    }




}
