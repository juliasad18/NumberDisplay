package main.java.com.numberdisplay;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Entrez le numéro: ");
        Scanner in = new Scanner(System.in);

        while(true) {
            String inputNumber = in.nextLine();
            NumberConverter.displayNumber(inputNumber, new VitalijsDesire());
            System.out.println("Voulez-vous entrer un nouveau numéro? (Oui/Non)");
            String inputAnswer = in.nextLine();
            if (inputAnswer.equals("Non")) {
                System.out.println("Au revoir!");
                break;
            } else {
                System.out.println("Entrez le numéro: ");
            }

        }








    }
}
