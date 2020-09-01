package com.numberdisplay;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Number implements INumber{
    private final String number;
    private final List<String> displayedNumber;

    public Number(String number) {
        this.number = number;
        this.displayedNumber = new ArrayList<>();
    }

    public List<String> getDisplayedNumber() {
        return displayedNumber;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public boolean appendToDisplayedNumber(String firstRow, String secondRow, String thirdRow) {
        if(displayedNumber.size() == 0) {
            displayedNumber.add(firstRow);
            displayedNumber.add(secondRow);
            displayedNumber.add(thirdRow);
            return true;
        } else {
            Logger logger = Logger.getLogger(Number.class.getName());
            logger.warning("displayedNumber list has not been updated because it already contains data. It can be updated only once.");
            return false;
        }
    }

    @Override
    public void printDisplayedNumber() {
        for(String string : displayedNumber) {
            System.out.println(string);
        }
    }


}
