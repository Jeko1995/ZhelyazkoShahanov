package Homeworks.Homework8;
/*
Напишете метод който има един входен параметър за дължина на масив и пълни масива със случайни числа
(да се използва клас Random).
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int [] generateArray = randomArray();
        System.out.println("Random array is:");
        System.out.println(Arrays.toString(generateArray));
        /*
        // Make every number from array to display in new line
        for ( int number : generateArray) {
            System.out.println(number);
        }
        */
    }
    private static int[] randomArray(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter length of array:");
        int[] array = new int[scanner.nextInt()];

        for (int i=0; i < array.length; i++){
            array [i] = random.nextInt(101);
        }
        return array;
    }
}
