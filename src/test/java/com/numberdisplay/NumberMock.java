package com.numberdisplay;

public class NumberMock implements INumber{
    private String number;
    private String firstRow;
    private String secondRow;
    private String thirdRow;

    public NumberMock(String number) {
        this.number = number;
    }

    public String getFirstRow() {
        return firstRow;
    }

    public String getSecondRow() {
        return secondRow;
    }

    public String getThirdRow() {
        return thirdRow;
    }

    @Override
    public String getNumber() {
        return number;
    }

//    @Override
//    public boolean appendToDisplayedNumber(String firstRow, String secondRow, String thirdRow) {
//        this.firstRow = firstRow;
//        this.secondRow = secondRow;
//        this.thirdRow = thirdRow;
//        return true;
//    }
//
//    @Override
//    public void printDisplayedNumber() {
//        System.out.println(firstRow);
//        System.out.println(secondRow);
//        System.out.println(thirdRow);
//    }

}
