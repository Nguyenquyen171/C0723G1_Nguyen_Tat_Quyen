package ss2.baitap;

import java.util.Scanner;

public class Prime100Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        for (int i = 2; i < 100; i++) {
            check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check && i < 100) {
                System.out.println(i);
            }

        }
    }
}
