package com.company.ht3;

import java.util.Scanner;

public class LastDigit {

    private static void printResult(int number, int poslZifraKv) {
        System.out.println("Квадрат числа " + number + " равняется " + poslZifraKv);
    }
    private static int askNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        while(!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    private static int findRemainder(int number) {
        return number % 10;
    }

    public static void main(String[] args) {
        int number;
        int poslZifra;
        int poslZifraKv;

        number = askNumber();

        poslZifra = findRemainder(number);

        poslZifraKv = findRemainder((int)Math.pow(poslZifra, 2));

        printResult(number, poslZifraKv);
    }
}
