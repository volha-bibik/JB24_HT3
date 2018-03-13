package com.company.ht3;

import java.util.Scanner;

public class MinMaxString {
    private static String max = "", min = "", str = "";

    private static void printResult(String data, String maxMin) {
        System.out.println(maxMin + " string = " + data + " length=" + data.length());
    }
    private static void askString(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
            checkMinMax(str, i);
        }
    }

    private static void checkMinMax (String str, int i) {
        if (i == 0) {
            min = str;
        }
        if (str.length() > max.length()) {
            max = str;
        } else if (str.length() < min.length()) {
            min = str;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            askString(i);
        }
        printResult(max, "max");
        printResult(min, "min");
    }
}
