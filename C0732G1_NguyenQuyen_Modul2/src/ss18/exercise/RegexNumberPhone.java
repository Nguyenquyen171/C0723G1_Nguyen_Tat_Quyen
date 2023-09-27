package ss18.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumberPhone {
    public static boolean validatePhoneNumber(String regex,String REGEX){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        final String REGEX_PHONENUMBER= "[^[(][84][)]]+[-(0]+[0-9]{9}+[)]$";
        String phoneNumber;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter the phone number according to format [(83)-(0123456789)");
            phoneNumber=scanner.nextLine();
            if (validatePhoneNumber(phoneNumber,REGEX_PHONENUMBER)){
                System.out.println("Your phone number is " + phoneNumber);
            }else {
                System.out.println("You don't have phone number ");
            }
        }while (!validatePhoneNumber(phoneNumber,REGEX_PHONENUMBER));
    }

}
