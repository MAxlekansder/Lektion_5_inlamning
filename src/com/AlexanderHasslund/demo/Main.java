package com.AlexanderHasslund.demo;

import java.util.Scanner;

public class Main {

     Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

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

        boolean isStop = true;
        //uppgift 3
        do {
            System.out.println("denna loop tar aldrig slut!! så länge isStop is = true! Stanna loopen? skriv Stop!");
            String aldrigSlut = scannerMain();


            if (aldrigSlut.toLowerCase().equals("stop")) {
                isStop = false;
            }

        } while (isStop);



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