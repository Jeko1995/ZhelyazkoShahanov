package Homeworks.Homework8;
/*
Ъпдейтнете задачата с намирането на максималното измежду 3 числа да използва Math класа.
 */
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter your third number:");
        int thirdNumber = scanner.nextInt();

        int result = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);

        System.out.printf("The max number is:\n" + result);
    }
}
