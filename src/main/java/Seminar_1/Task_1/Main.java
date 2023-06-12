package Seminar_1.Task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseNumber("3rf4g54"));

        System.out.println(divideTwoNumbers(10, 0));

        System.out.println(sumArrElements(new int[]{}));
    }

    public static int parseNumber(String inputString) {
        return Integer.parseInt(inputString);
    }

    public static int divideTwoNumbers(int numA, int numB) {
        return numA / numB;
    }

    public static int sumArrElements(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}