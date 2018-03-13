package com.company.ht3;

import java.util.Scanner;

public class Line01 {

    private static void printString(String resultString) {
        System.out.println(resultString);
    }

    private static int askNumber() {
        Scanner sc = new Scanner(System.in);
        printString("Введите число: ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            return -1;
        }
    }

    private static void findDigit(int number) {
        int digit;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                printString("В числе есть четная цифра.");
                return;
            }
        }
        printString("В числе нет четных цифр.");
    }
    public static void main(String[] args) {
        int number;

        number = askNumber();

        findDigit(number);
    }
}
