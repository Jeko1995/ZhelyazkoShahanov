package Homeworks;
/*
Домшано 4:
- Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки от елементите със
стойност равна на индекса на елемента умножен по 5. Елементите на масива да се изведат на конзолата.
- Напишете програма, която изчислява средната стойност от всички числа в масив (може да се използва горния масив)
- Напишете програма, която приема масив от числа и изчислява сумата на всички четни и нечетни числа от поредицата
изписвайки подходящо съобщение с резултата.
- Напишете програма (метод), която отпечатва на конзолата числата от 1 до N. Числото N се приема като параметър.
- Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.
- Напишете програма, която отпечатва сумата на първите N члена от редицата на Фибоначи. Числата на Фибоначи започват от
0 и 1, като всяко следващо се получава като сума от предходните две.
 */
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        int[] z1 = new int[20];

        for (int i = 0; i < 20; i++) {
            z1[i] = i * 5;
        }

        // Print the array elements
        for (int i = 0; i < 20; i++) {
            System.out.printf("For element %d from the array value is: %d\n", i, z1[i]);
        }
        // Print the arithmetic mean
        System.out.println("Arithmetic Mean: " + calculateMean(z1));
        // Display Even and Odd sum
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] numbers = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of even and odd numbers
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                // Even number
                sumEven += number;
            } else {
                // Odd number
                sumOdd += number;
            }
        }
        // Display the results
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        // Input max count number
        System.out.print("Enter max count number: ");
        int n = scanner.nextInt();

        // Call the method to count numbers
        countNumbers(n);
        // Call the method to count numbers that are not devided by 3 and 7
        notDivisibleBy3And7(n);

        System.out.print("Enter length of fibonacci: ");
        int f = scanner.nextInt();

        // Call the method to print Fibonacci numbers
        printFibonacciNumbers(f);
    }

    // Function to calculate the arithmetic mean of an array
    private static double calculateMean(int[] array) {
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;

    }
    // Method to count numbers from 1 to N
    private static void countNumbers(int n) {
        System.out.println("Counting numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(); // Move to the next line for better formatting
    }
    private static void notDivisibleBy3And7(int n) {
        System.out.println("Counting numbers from 1 to " + n + " not divisible by both 3 and 7:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(); // Move to the next line for better formatting
    }
    // Method to print the first N Fibonacci numbers
    private static void printFibonacciNumbers(int f) {
        System.out.println("First " + f + " Fibonacci numbers:");

        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 0; i < f; i++) {
            System.out.print(firstNumber + ", ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}