package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFile {
    private String regex;

    public boolean validate(String regex, String REGEX) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateId(String string) {
        regex = "^(NV-)+[0-9]{4}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid employee code");
        }
        return validate(string, regex);
    }

    public boolean validateName(String string) {
        regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!validate(string, regex)) {
            System.out.println("Invalid employee name");
        }
        return !validate(string, regex);
    }

    public boolean validateAge(String string) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dob = LocalDate.parse(string, dateTimeFormatter);
            if (string.equals(dateTimeFormatter.format(dob))) {
                LocalDate now = LocalDate.now();
                Period period = Period.between(dob, now);
                return period.getYears() >= 18;
            }
            return false;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public boolean validateIdentificationCard(String string) {
        regex = "^[0-9]{9}|[0-9]{12}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid employee identification card");
        }
        return validate(string, regex);
    }

    public boolean validatePhoneNumber(String string) {
        regex = "^[0]+[0-9]{9}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid phone number");
        }
        return validate(string, regex);
    }

    public boolean validateGender(String string) {
        regex = "Female|Male|male|female|Gay|gay";
        if (!validate(string, regex)) {
            System.out.println("Invalid gender");
        }
        return validate(string, regex);
    }

    public boolean validateGuestType(String string) {
        regex = "Intermediate Degree|College Degree|Bachelor's Degree|Postgraduate Degree";
        if (!validate(string, regex)) {
            System.out.println("Lever của bạn như loz ");
        }
        return validate(string, regex);
    }

    public boolean validateEmail(String string) {
        regex = "(([a-zA-Z0-9]+)(.[a-zA-Z0-9]+)*@gmail.com)$";
        if (!validate(string, regex)) {
            System.out.println("Not a email");
        }
        return validate(string, regex);
    }

    public boolean validateLever(String string) {
        regex = "Diamond|Platinum|Gold|Silver|Member$";
        if (!validate(string, regex)) {
            System.out.println("Not a lever");
        }
        return validate(string, regex);
    }
    public boolean validateLocation(String string){
        regex= "[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!validate(string,regex)){
            System.out.println("Please enter your location ");
        }
        return validate(string,regex);
    }
    public boolean validateIdCustomer(String string) {
        regex = "^(KH-)+[0-9]{4}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid customer Id");
        }
        return validate(string, regex);
    }
//    public boolean validateBirthDay(String string){
//        regex= "(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-((19|20)\\\\d{2})$";
//        if (!validate(string,regex)||!validateAge(string)){
//            return false;
//        } else {
//            return true;
//        }
//    }

}
