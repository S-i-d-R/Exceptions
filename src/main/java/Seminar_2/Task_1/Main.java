package Seminar_2.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введено: " + askForNumber());
    }

    private static float askForNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введено неверное значение!");
            }
        }
    }
}