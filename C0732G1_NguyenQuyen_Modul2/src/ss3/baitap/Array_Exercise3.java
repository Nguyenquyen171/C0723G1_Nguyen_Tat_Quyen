package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise3 {

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
        System.out.println();
        int length;
        int[] arrayTwo;
        do {
            System.out.println("Enter a length array: ");
            length = scanner.nextInt();
            if (length > 20) {
                System.out.println("length does not exceed 20");
            }
        } while (length > 20);
        arrayTwo = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            arrayTwo[i] = scanner.nextInt();
        }

        System.out.printf("Elements in array two: ");
        for (int j = 0; j < arrayTwo.length; j++) {
            System.out.print(arrayTwo[j] + " ");
        }
        System.out.println();
        int[] newArray = new int[array.length + arrayTwo.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            newArray[array.length+i]=arrayTwo[i];
        }
        System.out.println("New Array is:"+ Arrays.toString(newArray));
    }
}
