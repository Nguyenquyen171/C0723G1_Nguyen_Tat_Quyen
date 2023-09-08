package ss3.baitap;

import java.util.Scanner;

public class DiagonalLine_Array_Execise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        double[][] array;
        do {
            System.out.println("Enter the length of the square matrix: ");
            length = scanner.nextInt();
            array = new double[length][length];
            if (length > 0 && length <= 20 ) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        System.out.println("Enter elements" + "[" + i + "][" + j + "]: ");
                        array[i][j] = scanner.nextInt();
                    }
                }
                break;
            } else {
                System.out.println("You entered incorrectly, please re-enter");
            }


        } while (true);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Sums of elements in the square matrix: " + sum);


    }
}
