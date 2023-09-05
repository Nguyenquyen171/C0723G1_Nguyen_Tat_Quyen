package ss1.baitap.change_money;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int rate=23000;
        System.out.println("Please enter the amount of USD to be transferred");
        double usd = scanner.nextDouble();
        double vnd = rate * usd;
        System.out.println("Giá trị chuyển đổi là: " + vnd);

    }
}
