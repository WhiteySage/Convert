package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = {1000, 500, 100, 10, 5, 1};
        String symbols = "MDCLXVI";

        System.out.println("Enter a roman numeral:");
        String roman = sc.next();
        sc.close();

        roman = roman.toUpperCase();

        if (roman.matches(".*[0-9].*") || !roman.matches("[M|D|C|L|X|V|I]*")) {
            System.out.println("Impossible to convert. Write roman numeral");
        }


        int i = 0;
        int current = 0;
        int previous = 0;
        int arabic = 0;

        while (i < roman.length()) {
            char letter = roman.charAt(i);

            switch (letter) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }

            if (current > previous) {
                arabic += current - (previous * 2);
            } else {
                arabic += current;
            }
            previous = current;
            i += 1;
        }
        System.out.println("Arabic: " + arabic);

        }
    }
