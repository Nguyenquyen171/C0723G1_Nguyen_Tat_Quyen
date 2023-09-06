package ss2.thuchanh;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice= 0;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("1. Print the rectangle" );
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter the choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the rectangle length");
                    int rows = scanner.nextInt();
                    System.out.println("Enter the columns length");
                    int columns = scanner.nextInt();
//                    int rows= Integer.parseInt(System.console().readLine("Enter the rectangle length "));
//                    int columns= Integer.parseInt(System.console().readLine("Enter the columns length "));
//                    int rows=7;
//                    int columns=9;
                    for (int row = 0; row < rows; row++) {
                        for (int column = 0; column < columns; column++) {
                            System.out.print("*");
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the triangular height");
                    int triangularHeight = scanner.nextInt();
                    for (int i = 1; i <= triangularHeight; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = triangularHeight; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    for (int i = 1; i <= triangularHeight; i++) {
                        for (int j = 1; j <= triangularHeight; j++) {
                            if (j <= triangularHeight - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = triangularHeight; i >= 1; i--) {
                        for (int j = 1; j <= triangularHeight; j++) {
                            if (j <= triangularHeight - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the isosceles triangle height");
                    int isoscelesTriangleHeight = scanner.nextInt();
                    for (int i = 1; i <= isoscelesTriangleHeight; i++) {
                        for (int j = 1; j <= isoscelesTriangleHeight + i - 1; j++) {
                            if (j <= isoscelesTriangleHeight - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
                    break;
            }
        }while (choice<0 || choice>4);

    }

}