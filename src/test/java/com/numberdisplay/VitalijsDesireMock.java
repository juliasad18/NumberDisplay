package test.java.com.numberdisplay;

import main.java.com.numberdisplay.DisplayNumber;

public class VitalijsDesireMock implements DisplayNumber {
   String lastResult;

    @Override
    public void outputToDisplay(String number) {
        lastResult=number;
    }

    public String getLastResult() {
        return lastResult;
    }
}
