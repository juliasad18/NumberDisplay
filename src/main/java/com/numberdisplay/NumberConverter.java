package com.numberdisplay;

import java.util.HashMap;

public class NumberConverter {

    private NumberConverter() {
    }

    public static void convertNumber (INumber newNumber) throws NullPointerException {
        if (!(newNumber.getNumber().isEmpty())) {
            String firstRowString = "";
            String secondRowString = "";
            String thirdRowString = "";

            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            StringBuilder builder3 = new StringBuilder();

            for (int i = 0; i < newNumber.getNumber().length(); i++) {
                int numberFromChar = Character.getNumericValue(newNumber.getNumber().charAt(i));
                HashMap numberHashMap = numberVocabulary(numberFromChar);

                firstRowString = builder1.append(" ").append(numberHashMap.get(1).toString()).toString();
                secondRowString = builder2.append(" ").append(numberHashMap.get(2).toString()).toString();
                thirdRowString = builder3.append(" ").append(numberHashMap.get(3).toString()).toString();
            }

            newNumber.appendToDisplayedNumber(firstRowString, secondRowString, thirdRowString);
            newNumber.printDisplayedNumber();

        } else {
            System.out.println("Inserted value is empty. Please write any number.");
        }
    }



    private static HashMap<Integer, String> numberVocabulary (int number) {

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
