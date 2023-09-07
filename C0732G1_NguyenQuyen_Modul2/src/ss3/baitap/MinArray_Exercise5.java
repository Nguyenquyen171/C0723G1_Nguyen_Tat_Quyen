package ss3.baitap;

import java.util.Scanner;

public class MinArray_Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a length array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("length does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }

        System.out.printf("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int minElement=array[0];
        for (int i = 1; i < array.length; i++) {
            if (minElement>array[i]){
                minElement=array[i];
            }
        }
        System.out.println("Min element in array:" + minElement);
    }
}