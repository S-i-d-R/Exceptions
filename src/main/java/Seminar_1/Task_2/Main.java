package Seminar_1.Task_2;

public class Main {
    public static void main(String[] args) {
        int arrSum;

        arrSum = sum2d(new String[][]{{"1", "2"}, {"3", "4"}});

        arrSum = sum2d(new String[][]{{"1a", "2b", "0", "6", "7"}, {"3", "4", "0", "6", "7"}});

        arrSum = sum2d(new String[][]{{"3", "4", "0", "6", "7"}, null});

        arrSum = sum2d(new String[][]{(String[]) new Object()});

        System.out.println(arrSum);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
