package ss3.baitap;

import java.util.Scanner;

public class Total_RowArray_Exercise6 {
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
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("Enter the number of columns you want to sum ");
        int indexCol= scanner.nextInt();
        if (indexCol>=0&& indexCol<row){
            for (int i = 0; i <row ; i++) {
                sum += array[i][indexCol];
            }
            System.out.println("Sum of the elements of the column: " + sum);
        }else {
            System.out.println("You entered incorrectly, not column index in array");

        }

            


    }
}
