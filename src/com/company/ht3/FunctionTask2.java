package com.company.ht3;

import java.util.Scanner;

public class FunctionTask2 {

    public static double askForData (String AskedData) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter" +  AskedData + ": ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();

    };

    public static double calculateFunction (double x) {
        return 2 * Math.tan(x / 2) + 1;
    };

    public static void printResult (double x, double result) {
        System.out.println("\t" + x + "\t" + result);
    };

    public static void main(String[] args) {
        double IntervalBegin;
        double IntervalEnd;
        double Step;

        IntervalBegin = askForData("Interval Begin");
        IntervalEnd = askForData("Interval End");
        Step = askForData("Step");
        double result = 0;

        if (IntervalBegin > IntervalEnd || Step <= 0) {
            System.out.println("Enter correct data!");
        } else {
            for (double i = IntervalBegin; i <= IntervalEnd; i += Step) {
                result = calculateFunction(i);
                printResult(i, result);
            }
        }
    }


}
