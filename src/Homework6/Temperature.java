package Homework6;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxTemp = 99.90;
        double minTemp = -34.5;
        double temperature = scanner.nextDouble();
        scanner.close();
        if (temperature > maxTemp) {
            System.out.println("Porrige is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porrigi is too cold.");
        } else {
            System.out.println("Porrigi is just right.");

        }
    }
}