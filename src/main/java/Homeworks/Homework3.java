package Homeworks;

/*
Домашно 3:
- Напишете програма/ метод, която приема от конзолата 3 подадени числа определя кое е най-голяматo.
- Напишете програма/ метод, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
- Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не?
- Напишете програма/ метод, която чете число от 1 до 12 в конзолата и на базата на това изписва в конзолата месец от годината във формат:
You have selected 1. The month of the year is Monday.
 */

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //This is class Scanner
        Scanner scanner = new Scanner(System.in);

        //Print text in console
        System.out.println("#Task №1 Please enter your first number:");
        //Creating a variable which will hold a text value
        int number1 = scanner.nextInt();
        //Print text in console
        System.out.println("Please enter your second number:");
        //Creating a variable which will hold a text value
        int number2 = scanner.nextInt();
        //Print text in console
        System.out.println("Please enter third number:");
        //Creating a variable which will hold a text value
        int number3 = scanner.nextInt();

        // Compare and display the results
        if (number1 >= number2 && number1 >= number3) {
            System.out.printf("%d is the largest number.\n", number1);
            if (number1 == number2 && number1 == number3)
               System.out.println("All numbers are equal.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.printf("%d is the largest number.\n", number2);
            if (number2 == number1 && number2 == number3)
                System.out.println("All numbers are equal.");
        } else if (number3 >= number1 && number3 >= number2) {
            System.out.printf("%d is the largest number.\n", number3);
            if (number3 == number1 && number3 == number2)
                System.out.println("All numbers are equal.");

        }

        //Print text in console
        System.out.println("#Task №2 Please enter length of a rectangle:");
        //Creating a variable which will hold a text value
        int number4 = scanner.nextInt();
        //Print text in console
        System.out.println("Please enter width of rectangle:");
        //Creating a variable which will hold a text value
        int number5 = scanner.nextInt();

        //Calculating and print perimeter
        int perimeter = ((2 * number4) + (2 * number5));
        System.out.printf("Perimeter of rectangle is %d.\n", perimeter);

        //Calculating and print area
        int area = (number4 * number5);
        System.out.printf("Area of rectangle is %d.\n", area);

        //Print text in console
        System.out.println("#Task №3 Please enter your number:");
        //Creating a variable which will hold a text value
        int number6 = scanner.nextInt();

        //Check if the number is odd or even
        if(number6 % 2 == 0) {
            System.out.printf("%d is even.\n", number6);
        }else {
            System.out.printf("%d is odd.\n", number6);
        }

        //Print text in console
        System.out.println("#Task №4 Please enter number of month:");
        //Creating a variable which will hold a text value
        int month = scanner.nextInt();

        //Check wich month if year is it
        switch (month){
            case 1:
                System.out.printf("You have selected %d. The month of the year is January.\n", month);
                break;
            case 2:
                System.out.printf("You have selected %d. The month of the year is February.\n", month);
                break;
            case 3:
                System.out.printf("You have selected %d. The month of the year is March.\n", month);
                break;
            case 4:
                System.out.printf("You have selected %d. The month of the year is April.\n", month);
                break;
            case 5:
                System.out.printf("You have selected %d. The month of the year is May.\n", month);
                break;
            case 6:
                System.out.printf("You have selected %d. The month of the year is June.\n", month);
                break;
            case 7:
                System.out.printf("You have selected %d. The month of the year is July.\n", month);
                break;
            case 8:
                System.out.printf("You have selected %d. The month of the year is August.\n", month);
                break;
            case 9:
                System.out.printf("You have selected %d. The month of the year is September.\n", month);
                break;
            case 10:
                System.out.printf("You have selected %d. The month of the year is October.\n", month);
                break;
            case 11:
                System.out.printf("You have selected %d. The month of the year is November.\n", month);
                break;
            case 12:
                System.out.printf("You have selected %d. The month of the year is December.\n", month);
                break;
            default:
                System.out.println("Please enter number of month!");
        }
    }
}