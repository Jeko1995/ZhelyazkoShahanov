package Homeworks.Homework6;

/*
Напишете метод, който на база въведени две числа връща средна стойност.
Напишете др метод, който приема два параметъра - числа, и връща сумата им.
Извикайте втория метод с параметри първия.
 */


import java.util.Scanner;

public class AverageAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double average = calculateAverage(num1, num2);
        System.out.println("Average: " + average);

        double sum = calculateSum(num1, num2);
        System.out.println("Sum: " + sum);
    }

    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }
}
