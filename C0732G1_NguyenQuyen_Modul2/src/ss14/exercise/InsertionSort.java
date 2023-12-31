package ss14.exercise;

import java.util.Arrays;

public class InsertionSort {
    public  static void sort(int list[]) {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int index = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > index) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = index;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Array before sorting: "+ Arrays.toString(arr));

    }

}
