package ss13.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySystem {
    int binarySearch(int[] array, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] > x)
                return binarySearch(array, left, mid - 1, x);

            return binarySearch(array, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter the length array");
            number = scanner.nextInt();
        } while (number < 0 || number > 20);
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the " + i + " element");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array after sorting:" + Arrays.toString(array));
        BinarySystem ob = new BinarySystem();
        int n = array.length;
        int index;
        do {
            System.out.println("Enter the element to find");
           index = scanner.nextInt();
        }while (index<0);

        int result = ob.binarySearch(array, 0, n - 1, index);
        if (result == -1) {
            System.out.println(
                    "Element is not present in array");
        } else
            System.out.println(
                    "Element is present at index " + result);
    }
}
