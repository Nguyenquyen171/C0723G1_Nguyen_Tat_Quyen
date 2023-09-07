package ss3.baitap;

import java.util.Scanner;

public class TextInArray_Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.next();
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Character " + character + " appear " + count + " times the string" );
    }
}
