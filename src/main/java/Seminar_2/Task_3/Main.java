package Seminar_2.Task_3;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, null);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (NullPointerException ex) {
            System.out.println("Передан null в качестве аргумента");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс за пределами массива!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}
