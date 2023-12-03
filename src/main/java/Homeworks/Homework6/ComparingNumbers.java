package Homeworks.Homework6;

/*
Напишете метод, който проверява дали въведените 3 числа са:
Положителни
Равни
 */

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        // Create a Scanner for console input
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner to input the password
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter your third number: ");
        int num3 = scanner.nextInt();

        if (arePositiveAndEqual(num1, num2, num3)) {
            System.out.println("The numbers are positive and equal.");
        } else {
            System.out.println("The numbers are not positive and equal.");
        }
    }

    public static boolean arePositiveAndEqual(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a == b && b == c;
    }
}

