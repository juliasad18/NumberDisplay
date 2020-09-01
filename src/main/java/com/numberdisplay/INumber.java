package com.numberdisplay;

public interface INumber {
    boolean appendToDisplayedNumber(String firstRow, String secondRow, String thirdRow);
    void printDisplayedNumber();
    String getNumber();
}
