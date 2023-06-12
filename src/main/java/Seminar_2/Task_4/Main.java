package Seminar_2.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введен текст: " + askForInput());
    }

    private static String askForInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String input = scanner.nextLine();
        if (input.isBlank()) {
            throw new Exception("Пустую строку вводить нельзя");
        } else {
            return input;
        }
    }
}
