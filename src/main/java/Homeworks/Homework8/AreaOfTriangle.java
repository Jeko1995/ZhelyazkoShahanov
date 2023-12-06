package Homeworks.Homework8;

import java.util.Locale;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter base:");
        double base = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();

        double area = (Math.abs(base) * Math.abs(height)) / 2;
        System.out.println("Area of the triangle is:\n" + area);
    }
}
