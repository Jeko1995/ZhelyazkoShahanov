//location of the current class
package Homeworks;

/*
Домашно 2:
Заместете даден под-string в даден string с друг текст:
Пример: “My name is <Test>” – заместете Test с нещо, което чете от конзолата.

Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.

Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.

Обединете 2 и повече стринга в един и го изпишете в конзолата.

За упражнение: https://www.w3resource.com/java-exercises/string/index.php
 */

//Import something that we want to use
import java.util.Scanner;

//definition of a class
public class Homework2 {
    //this is main method
    public static void main(String[] args) {

        //Print text in console
        System.out.println("Please enter your name:");

        //This is class Scanner
        Scanner scanner = new Scanner(System.in);
        //Creating a variable which will hold a text value
        String Test= scanner.nextLine();

        //Print text in console
        System.out.println("My name is " + Test);



        //Print text in console
        System.out.println("Please enter your last name:");
        //Creating a variable which will hold a text value
        String Test1= scanner.nextLine();

        //Print text in console plus result of the question are the both string the same
        System.out.println("Are the two names the same? " + Test.equals(Test1));



        //Print text in console
        System.out.println("Please write your favourite sentence");
        //Creating a variable which will hold a text value
        String str= scanner.nextLine();
        //Split the string in to words
        String[] l = str.split(" ");
        //Print text in console plus length of the string
        System.out.println("The number of words in the given string text is: " + l.length);



        //Combine and print in the console few strings and variables
        System.out.println("My full name is " + Test + " " + Test1 + " and my favourite sentence is: " + str);
    }
}
