package com.company.ht3;

import java.util.Scanner;

public class ColDays {

    private static void printResult(int col_day) {
        System.out.println("Количество дней равно - " + col_day);
    }

    private static int askNumber(String enterData) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + enterData + ": ");
        if(!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    private static int findDaysNumber(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;

        }
    }
    public static void main(String[] args) {
        int year, month, col_day;

        year = askNumber("enter year");
        month = askNumber("enter month number");

        col_day = findDaysNumber(month, year);
            printResult(col_day);
        }
    }

