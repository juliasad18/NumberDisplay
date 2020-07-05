package com.numberdisplay;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Entrez le numéro: ");
        Scanner in = new Scanner(System.in);

        while(true) {
            String inputNumber = in.nextLine();

            String[] numberArray = NumberConverter.displayNumber(inputNumber);
            for(String string : numberArray) {
                System.out.println(string);
            }

            System.out.println("Voulez-vous entrer un nouveau numéro? (Oui/Non)");
            String inputAnswer = in.nextLine();
            if (inputAnswer.equals("Non")) {
                System.out.println("Au revoir!");
                break;
            } else if (inputAnswer.equals("Oui")) {
                System.out.println("Entrez le numéro: ");
            } else {
                System.out.println("Considered as Yes :)");
                System.out.println("Entrez le numéro: ");
            }
        }
    }
}
