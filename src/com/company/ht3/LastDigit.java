package com.company.ht3;

import java.util.Scanner;

public class LastDigit {

    private static void printResult(int number, int poslZifraKv) {
        System.out.println("Квадрат числа " + number + " равняется " + poslZifraKv);
    }

    private static int askNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            return 0;
        }

    }

    private static int findRemainder(int number) {
        return number % 10;
    }

    private static int findLastNumberKv(int LastNumber) {
        int resultNumber;
        switch (LastNumber) {
            case 0:
                resultNumber = 0;
                break;
            case 1:
                resultNumber = 1;
                break;
            case 2:
                resultNumber = 4;
                break;
            case 3:
                resultNumber = 9;
                break;
            case 4:
                resultNumber = 6;
                break;
            case 5:
                resultNumber = 5;
                break;
            case 6:
                resultNumber = 6;
                break;
            case 7:
                resultNumber = 9;
                break;
            case 8:
                resultNumber = 4;
                break;
            case 9:
                resultNumber = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
                resultNumber = -1;
        }
        return resultNumber;
    }

    public static void main(String[] args) {
        int number, poslZifra, poslZifraKv;

        number = askNumber();
        poslZifra = findRemainder(number);
        poslZifraKv = findLastNumberKv(poslZifra);
        if (poslZifraKv != -1){
            printResult(number, poslZifraKv);
        }
    }
}
