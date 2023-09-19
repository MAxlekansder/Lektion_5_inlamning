package com.AlexanderHasslund.demo;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input a integer");
        while(!scan.hasNextInt()) {
            System.out.println("that's not a number");
            scan.next();
            System.out.println("Try again!");
        }
        System.out.println("That's a number");
    }
}