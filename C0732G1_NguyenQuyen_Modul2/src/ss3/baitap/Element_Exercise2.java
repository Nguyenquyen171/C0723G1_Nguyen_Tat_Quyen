package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Element_Exercise2 {
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
        System.out.println("Enter the element to add: ");
        int addNumber = scanner.nextInt();
        int[] newArray= new int[array.length+1];
        do {
            System.out.println("Enter the index to add");
            int index = scanner.nextInt();
            if (index>=-1 && index<=newArray.length-1){
                for (int i = 0; i < index; i++) {
                    newArray[i]=array[i];
                }
                newArray[index]=addNumber;
                for (int i = index+1; i <newArray.length ; i++) {
                    newArray[i]=array[i-1];
                }
                System.out.println(Arrays.toString(newArray));
                break;
            }else{
                System.out.println("Cannot insert " + addNumber + " into the array");
            }
        }while (true);

    }
}
// if (index <= -1 || index >= newArray.length - 1) {
//         System.out.println("Cannot insert " + addNumber + " into the array");
//
//         } else {
//         for (int i = 0; i < index; i++) {
//        newArray[i] = array[i];
//        }
//        newArray[index] = addNumber;
//
//        for (int i = index + 1; i < newArray.length; i++) {
//        newArray[i] = array[i - 1];
//        }
//        }
//        System.out.println(Arrays.toString(newArray));