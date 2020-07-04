package test.java.com.numberdisplay;

import main.java.com.numberdisplay.Number;
import main.java.com.numberdisplay.NumberConverter;

public class NumberConverterTest {
    public static void main(String[] args) {
        NumberConverterTest eeeem = new NumberConverterTest();
        eeeem.displayNumberTest();
    }
    public void displayNumberTest() {
        Number testNumber = new Number("123");
        VitalijsDesireMock printout = new VitalijsDesireMock();
        NumberConverter.displayNumber(testNumber.getNumber(), printout);
        System.out.println(printout.getLastResult());



    }




}
