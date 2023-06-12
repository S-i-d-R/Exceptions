package Seminar_2.Task_2;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 8;
        int divider = 0;

        if (index >= intArray.length) {
            System.out.printf("Индекс %d за пределами массива%n", index);
        } else if (divider == 0) {
            System.out.println("Деление на ноль недопустимо");
        } else {
            System.out.println((double) intArray[index] / divider);
        }
    }
}