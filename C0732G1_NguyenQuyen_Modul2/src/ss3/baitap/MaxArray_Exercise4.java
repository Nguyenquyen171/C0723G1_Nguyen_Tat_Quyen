package ss3.baitap;

import java.util.Scanner;

public class MaxArray_Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int[][] array;
        do {
            System.out.println("Enter the row of the 2-dimensional array: ");
            row = scanner.nextInt();
            System.out.println("Enter the col of the 2-dimensional array: ");
            col = scanner.nextInt();
            array = new int[row][col];
            if (row > 0 && row <= 20 && col > 0 && col <= 20) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.println("Enter elements" + "[" + i + "][" + j + "]: ");
                        array[i][j] = scanner.nextInt();
                    }
                }
                break;
            } else {
                System.out.println("You entered incorrectly, please re-enter");
            }


        } while (true);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println("Max Element in 2-dimensional array:" + maxElement);
    }


}
