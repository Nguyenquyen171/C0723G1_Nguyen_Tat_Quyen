package ss11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void binary() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int divisor=0;
        int binary=0;
        while (number>0){
            binary+= number%2 * Math.pow(10,divisor);
            divisor++;
            number /=2;
        }
      stack.push(binary);
        System.out.println(stack);
    }
    public static void main(String[] args) {
        binary();
    }
}

