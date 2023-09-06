package ss1.baitap.number_to_letter;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        if (number >= 0 && number < 1000) {
            String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

            int hundreds = number / 100;
            int tensDigit = (number % 100) / 10;
            int onesDigit = number % 10;

            StringBuilder result = new StringBuilder();

            if (hundreds > 0) {
                result.append(units[hundreds]).append(" hundred ");
            }

            if (tensDigit == 1) { // Handle numbers from 10 to 19
                result.append(teens[onesDigit]);
            } else { // Handle numbers from 20 onwards
                if (tensDigit > 1) {
                    result.append(tens[tensDigit]);
                }
                if (onesDigit > 0) {
                    result.append(units[onesDigit]);
                }
            }

            System.out.println(number + " read as " + result.toString().trim());
        } else {
            System.out.println("Out of range");
        }
    }
}
