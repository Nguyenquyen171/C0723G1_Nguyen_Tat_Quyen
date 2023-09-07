package ss3.baitap;

import java.util.Scanner;
import java.util.Arrays;

public class Element_Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a long array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i+1)+ " :");
            array[i]= scanner.nextInt();
        }

        System.out.printf( "Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+ " ");
        }
        System.out.println();
        System.out.println("Enter the element to delete: ");
        int deleteNumber= scanner.nextInt();
        boolean check=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteNumber) {
                check=true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;

            }
        }
        if (check){
            System.out.println("The new array after deleting the duplicate element is:" + Arrays.toString(array));
        }else {
            System.out.println("The number you want to delete is in the element" + deleteNumber);
        }
    }
}
