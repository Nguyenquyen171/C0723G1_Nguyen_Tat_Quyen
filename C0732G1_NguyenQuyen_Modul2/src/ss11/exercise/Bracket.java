package ss11.exercise;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Bracket {
    public static void main(String[] args) {
        String equation = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        Stack<Character> blacketStack = new Stack<>();
        char[] charArray = equation.toCharArray();
        for (char index : charArray) {
            System.out.print(index);
        }
        for (char index : charArray) {
            if (index == '(') {
                blacketStack.push(index);
            } else if (index == ')') {
                if (blacketStack.empty()) {
                    System.out.println(" True");
                    break;
                } else {
                    blacketStack.pop();
                }
            }
        }
        if (blacketStack.isEmpty()) {
            System.out.println(" True");
        } else {
            System.out.println(" False");
        }
    }
}

