package com.training.assignments;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/20/2017.
 */
public class Coins {
    static int Remaining;
    static int Q;
    static int D;
    static int N;
    static int P;



    public static void main(String args[]){
        System.out.println("Welcome to the Change Calculator");
        CoinCal();

    }
    static void CoinCal(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number of cents (0-99): ");
        int Amount = scanner.nextInt();

        int Q = (Amount / 25);
        System.out.println("Quarters: "+(Q));
        Remaining = Amount % 25;

        D = (Remaining / 10);
        System.out.println("Dimes:    "+(D));
        Remaining = Remaining % 10;

        N = (Remaining / 5);
        System.out.println("Nickels:  "+(N));
        Remaining = Remaining % 5;

        P = (Remaining / 1);
        System.out.println("Pennies:  "+(P));
        Remaining = Remaining % 1;
        System.out.print("\nContinue? (y/n): ");
        choice();


    }
    static void choice() {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y"))
           CoinCal();
        else if (input.equals("n") || input.equals("N")) {

            System.out.println("Bye ...!!!");
        }
    }
}

