package com.company.ht3;

import java.util.Scanner;

public class FunctionTask3 {

    private static double xValue;

    private static double askForData (String askedData) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter" +  askedData + ": ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();

    }

    private static double calculateFunction (double x) {
        if (x <= -3) {
            return 9;
        } else {
            return 1/(Math.pow(x, 2) + 1);
        }
    }

    private static void printResult (double x, double result) {
        System.out.println("\t" + x + "\t" + result);
    }

    public static void main(String[] args) {

        xValue = askForData("X value");
        double result;

        result = calculateFunction(xValue);
        printResult(xValue, result);
    }
}
