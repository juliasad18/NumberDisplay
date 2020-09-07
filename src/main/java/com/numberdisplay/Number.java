package com.numberdisplay;

public class Number implements INumber{
    private final String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }



}
