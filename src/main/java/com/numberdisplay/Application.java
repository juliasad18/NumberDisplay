package com.numberdisplay;

import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez le numéro: ");

        while(true) {
            String inputNumber = in.nextLine();

            try {
                Long start = System.currentTimeMillis();
                NumberConverter.convertNumber(new Number(inputNumber));
                System.out.println("Logging time to check performance --> NumberConverter.convertNumber() working time: " + (System.currentTimeMillis() - start) + " milliseconds.");
            } catch(NullPointerException e) {
                Logger logger = Logger.getLogger(Number.class.getName());
                logger.warning("Error message: " + e.toString());
                System.out.println("Inserted value must be a number.");
            }

            System.out.println("Voulez-vous entrer un nouveau numéro? (Oui/Non)");
            String inputAnswer = in.nextLine();
            if (inputAnswer.toLowerCase().contains("non")) {
                System.out.println("Au revoir!");
                break;
            } else if (inputAnswer.toLowerCase().contains("oui")) {
                System.out.println("Entrez le numéro: ");
            } else {
                System.out.println("Considered as Yes :)");
                System.out.println("Entrez le numéro: ");
            }
        }
    }
}
