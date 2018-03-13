package com.company.ht3;

import java.util.Scanner;

public class FunctionTask3 {


    private static double askForData () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X value: ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();

    }

    private static double calculateFunction (double x) {
        if (x <= -3) {
            return 9;
        } else if (x > 3){
            return 1/(Math.pow(x, 2) + 1);
        } else {
            return Double.NaN;
        }
    }

    private static void printResult (double x, double result) {
        System.out.println("\t" + x + "\t" + result);
    }

    public static void main(String[] args) {
        double xValue, result;

        xValue = askForData();
        result = calculateFunction(xValue);
        printResult(xValue, result);
    }
}
