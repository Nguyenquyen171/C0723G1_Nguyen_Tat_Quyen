package ss2.thuchanh;

public class DrawDiamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n");
            for (int j = 1; j <= 6 + i; j++) {
                if (j == 6 - i) {
                    System.out.print(i);
                } else if (j == 6 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 4; i >= 1; i--) {
            System.out.print("\n");
            for (int j = 1; j <= 6 + i; j++) {
                if (j == 6 - i) {
                    System.out.print(i);
                } else if (j == 6 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}