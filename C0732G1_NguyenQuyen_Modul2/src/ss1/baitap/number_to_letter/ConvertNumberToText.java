package ss1.baitap.number_to_letter;

import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number >= 0 && number < 1000) {
            String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

            int hundreds = number / 100;
            int tensDigit = (number % 100) / 10;
            int onesDigit = number % 10;

            String result = "";

            if (hundreds > 0) {
                result = units[hundreds] + " hundred ";
            }

            if (tensDigit == 1) {
                result += teens[onesDigit];
            } else {
                if (tensDigit > 1) {
                    result += tens[tensDigit];
                }
                if (onesDigit > 0) {
                    result += units[onesDigit];
                }
            }

            System.out.println(number + " read " + result);
        } else {
            System.out.println("Out of range");
        }
    }
}