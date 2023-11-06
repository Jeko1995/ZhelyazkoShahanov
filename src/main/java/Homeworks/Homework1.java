//location of the current class
package Homeworks;

/*
Домашно 1:
Напишете програма, която:

Чете за име на потребител

Чете за любимо хоби на потребителя

Изписва в конзолата подходящо съобщение за потребителя и хобито

Споделяте проекта в github
 */


//Import something that we want to use
import java.util.Scanner;

//definition of a class
public class Homework1 {
    //this is main method
    public static void main(String[] args) {

        //Print text in console
        System.out.println("Please enter your name:");

        //This is class Scanner
        Scanner scanner = new Scanner(System.in);
        //Creating a variable which will hold a text value
        String userName = scanner.nextLine();

        //Print text in console
        System.out.println("What is your favourite hobby:");
        //Creating a variable which will hold a text value
        String userHobby = scanner.nextLine();

        //Print text in console
        System.out.println("Hello " + userName + ". " + userHobby + " is one of the best hobbies all over the world.");

    }

}
