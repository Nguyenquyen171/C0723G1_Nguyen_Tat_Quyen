package ss3.thuchanh;

import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }

        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.printf("Reverse array:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }


}

