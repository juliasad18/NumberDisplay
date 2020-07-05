package com.numberdisplay;

import java.util.HashMap;

public class NumberConverter {

    public static String[] displayNumber (String number) {
        String firstRowString = "";
        String secondRowString = "";
        String thirdRowString = "";

        Number newNumber = new Number(number);

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder();


        for (int i = 0; i < newNumber.getNumber().length(); i++) {
            int numberFromChar = Character.getNumericValue(newNumber.getNumber().charAt(i));
            HashMap numberHashMap = findNumber(numberFromChar);

            firstRowString = builder1.append(" ").append(numberHashMap.get(1).toString()).toString();
            secondRowString = builder2.append(" ").append(numberHashMap.get(2).toString()).toString();
            thirdRowString = builder3.append(" ").append(numberHashMap.get(3).toString()).toString();

        }

        return new String[] {firstRowString, secondRowString, thirdRowString};

    }

    public static HashMap<Integer, String> findNumber (int number) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        switch (number) {
            case 0:
                hashMap.put(1, "._.");
                hashMap.put(2, "|.|");
                hashMap.put(3, "|_|");
                break;
            case 1:
                hashMap.put(1, "...");
                hashMap.put(2, "..|");
                hashMap.put(3, "..|");
                break;
            case 2:
                hashMap.put(1, "._.");
                hashMap.put(2, "._|");
                hashMap.put(3, "|_.");
                break;
            case 3:
                hashMap.put(1, "._.");
                hashMap.put(2, "._|");
                hashMap.put(3, "._|");
                break;
            case 4:
                hashMap.put(1, "...");
                hashMap.put(2, "|_|");
                hashMap.put(3, "..|");
                break;
            case 5:
                hashMap.put(1, "._.");
                hashMap.put(2, "|_.");
                hashMap.put(3, "._|");
                break;
            case 6:
                hashMap.put(1, "._.");
                hashMap.put(2, "|_.");
                hashMap.put(3, "|_|");
                break;
            case 7:
                hashMap.put(1, "._.");
                hashMap.put(2, "..|");
                hashMap.put(3, "..|");
                break;
            case 8:
                hashMap.put(1, "._.");
                hashMap.put(2, "|_|");
                hashMap.put(3, "|_|");
                break;
            case 9:
                hashMap.put(1, "._.");
                hashMap.put(2, "|_|");
                hashMap.put(3, "._|");
                break;
        }

        return hashMap;
    }



}
