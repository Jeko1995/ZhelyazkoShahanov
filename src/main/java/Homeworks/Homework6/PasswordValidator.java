package Homeworks.Homework6;

/*
Напишете метод, който проверява дали въведен стринг може да бъде използван за парола. Основни правила за парола:
Паролата трябва да е поне 8 символа;
Паролата трябва да съдържа символ, число и букви;
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        // Create a Scanner for console input
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner to input the password
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        // Close the Scanner after you're done with it
        scanner.close();

        // Call the method to validate the password
        if (isPasswordValid(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }

    // Method to check if the password is valid
    public static boolean isPasswordValid(String password) {
        // Check for length
        if (password.length() < 8) {
            return false;
        }

        // Check for at least one symbol, one number, and one letter
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&+=<>?:,./]).*$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
