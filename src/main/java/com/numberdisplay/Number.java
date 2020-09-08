package com.numberdisplay;

import java.util.ArrayList;
import java.util.List;

public class Number implements INumber{
    private final String number;
    private List<String> arrayList = new ArrayList<>();

    public Number(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void addRowToArrayList(String number) {
        this.arrayList.add(number);
    }

    public List<String> getArrayList() {
        return arrayList;
    }
}
