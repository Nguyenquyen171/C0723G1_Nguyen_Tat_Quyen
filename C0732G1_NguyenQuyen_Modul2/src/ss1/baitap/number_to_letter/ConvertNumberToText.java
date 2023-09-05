package ss1.baitap.number_to_letter;

import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String[] arrUnits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr10To19 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozen = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundred = { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        int unitNumber = number % 10;
        int dozenNumber = number / 10;
        int hundredNumber = number / 100;
        String result;

        if (number >= 0 && number < 10) {
            result = arrUnits[number];
        } else if (number < 20) {
            result = arr10To19[unitNumber];
        } else if (number < 100) {
            result = dozen[dozenNumber-2];
            if (unitNumber > 0) {
                result += " " + arrUnits[unitNumber];
            }
        } else if (number < 1000) {

            result = hundred[hundredNumber-1];
            int dozenNumber1 = dozenNumber % 10;

            if (dozenNumber1 == 0 && unitNumber > 0) {
                result += " " + arrUnits[unitNumber];
            } else if (dozenNumber1 == 1) {
                result += " " + arr10To19[unitNumber];
            } else {
                result += " " + dozen[dozenNumber1];
                if (unitNumber > 0) {
                    result += " " + arrUnits[unitNumber];
                }
            }
        } else {
            result = "Out of ability";
        }
        System.out.println(number + ": " + result);
    }
}