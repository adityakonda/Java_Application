package com.training.assignments;

import java.util.Scanner;


/**
 * Created by Thanmayi on 7/18/2017.

 */
public class RectangleAreaPerimeter {

    public static void main(String args[]) {

        welcomeMsg("thanu");

        calc();


    }

    static void calc() {

        Scanner scanner = new Scanner(System.in);

        int length = getIntWithinRange(scanner, "Enter length: ", 1, 1000);
        int width = getIntWithinRange(scanner, "Enter width: ", 1, 1000);

        System.out.println("Area:         " + Area(length, width));
        System.out.println("Perimeter:    " + Perimeter(length, width));

    }

    void choice() {

        System.out.print("Continue? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y")) {

            calc();

        } else if (input.equals("n") || input.equals("N")) {

            System.out.println("Bye ...!!!");
        }


    }

    static void welcomeMsg(String name) {

        System.out.println("Welcome " + name + "to the Area and Perimeter Calculator");
    }

    static int Area(int length, int width) {
        return (length * width);
    }

    static int Perimeter(int length, int width) {
        return 2 * (length + width);
    }

//    public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max){
//
//        return 0.0;
//    }


    public static int getIntWithinRange(Scanner scanner, String prompt, int min, int max) {

        int result = 0;
        boolean isValid = false;

        while (isValid == false) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result <= min) {
                    System.out.println("Error! Number must be greater than " + min);

                } else if (result >= max) {
                    System.out.println("Error! Number must be less than " + max);

                } else if (scanner.hasNextInt()) {
                    result = scanner.nextInt();
                    isValid = true;
                } else System.out.println("Error! Invalid decimal value. Try again.");
            }


        }
        return result;

    }

}






