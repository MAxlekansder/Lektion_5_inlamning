package com.AlexanderHasslund.demo;

import java.awt.*;
import java.util.Scanner;

public class Main {

     Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        MenuChoiches menu = new MenuChoiches();

        uppgift0();

        //uppgift 1
        System.out.print("Vad är ditt namn?: ");
        String name = scannerMain();
        System.out.println("ditt namn är alltså: " + name);

        System.out.print("Hur gammal är du?: ");
        int age = scannerNumber();
        System.out.println("Du är alltså: " + age + " år gammal");

        //uppgift 2
        System.out.print("Skriv in ett heltal för antalet loops du vill göra!: ");
        int result = scannerNumber();
        for (int i = 0; i < result; i++) {
            System.out.println("loop... "+i);

        }

        System.out.println("Tryck på valfri knapp för att försätta...");
        //uppgift 5 tough nut
        boolean isStop = true;
        do{

            menu.menuChoices();
            //System.out.println("välj ditt val! ");
            String input = scannerMain();
          //  if (input.equals("1")) {
          //      int convertString = Integer.parseInt(input);
          //  }

            switch (input.toLowerCase()) {

                case "1":
                    System.out.println("Throwing");

                    break;
                case "stop": isStop = false;
                    break;
                default:
                    System.out.println("wrong input");
            }

        } while(isStop);





    }

    public static void uppgift0() {
        Main myScanAttribute = new Main();

        System.out.println("Input a integer");
        while(!myScanAttribute.scan.hasNextInt()) {

            System.out.println("that's not a number, try again!");
            myScanAttribute.scan.nextLine();

        }
        System.out.println("That's a number!");
    }

    //uppgift 1
    public static String scannerMain() {
        //static ska inte finnas med om det finns i en annan klass
        //scan = objekt
        Scanner scannerString = new Scanner(System.in);
        String input = scannerString.nextLine();

        return input;
    }

    //uppgift  2
    public static int scannerNumber() {

        Scanner scannerInt = new Scanner(System.in);
        return scannerInt.nextInt();
    }

}
/*
    boolean isStop = true;
   //uppgift 3
        do {
            System.out.println("denna loop tar aldrig slut!! så länge isStop is = true! Stanna loopen? skriv Stop!");
            String aldrigSlut = scannerMain();


            if (aldrigSlut.toLowerCase().equals("stop")) {
                isStop = false;
            }

        } while (isStop);
 */