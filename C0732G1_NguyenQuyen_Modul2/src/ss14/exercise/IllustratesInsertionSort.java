package ss14.exercise;

import java.util.Arrays;

public class IllustratesInsertionSort {
    public  static void sort(int list[]) {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            System.out.println("Bước " + i + " gán x  = list[" + i + "] = " + list[i] + " pos= " + i);
            int index = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > index) {
                System.out.println("Đổi chỗ cho list[" + index + "] và list[" + (index - 1) + "]");
                list[j + 1] = list[j];
                j = j - 1;

            }
            list[j + 1] = index;
            System.out.println("Loop " + i + Arrays.toString(list));
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Array before sorting: "+ Arrays.toString(arr));

    }
}
