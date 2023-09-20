package ss13.exercise;

import java.util.Scanner;

public class LargestChain {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the String: ");
                String string = input.nextLine();

                int maxLength = 1;
                int startIndex = 0;
                int currentLength = 1;
                int currentStartIndex = 0;
                for (int i = 1; i < string.length(); i++) {
                    if (string.charAt(i) > string.charAt(i - 1)) {
                        currentLength++;
                    } else {
                        if (currentLength > maxLength) {
                            maxLength = currentLength;
                            startIndex = currentStartIndex;
                        }
                        currentLength = 1;
                        currentStartIndex = i;
                    }
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = currentStartIndex;
                }
                System.out.print("Longest ascending sequence: ");
                for (int i = startIndex; i < startIndex + maxLength; i++) {
                    System.out.print(string.charAt(i));
                }
            }
        }


