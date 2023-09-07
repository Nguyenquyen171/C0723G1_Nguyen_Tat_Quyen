package ss2.baitap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        boolean check;
            for (int i = 2; count < number; i++) {
                check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(i);
                    count++;
                }

        }
    }
}
//        if (number < 2){
//            System.out.println(number +    " is not a prime");
//
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check)
//                System.out.println(number );
//            else
//                System.out.println(number + " is not a prime");
//        }
//    }
