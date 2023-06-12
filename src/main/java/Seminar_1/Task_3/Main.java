package Seminar_1.Task_3;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 2, 1};

        int[] difference = getArrayDiff(arr1, arr2);
        if (difference != null) {
            System.out.println("Разность массивов:");
            for (int num : difference) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] getArrayDiff(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не совпадают!");
            return null;
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}