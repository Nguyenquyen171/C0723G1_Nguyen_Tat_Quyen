package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFile {
    private String regex;

    public boolean validate(String regex, String REGAX) {
        Pattern pattern = Pattern.compile(REGAX);
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
        LocalDate localDate = LocalDate.parse(string, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
        LocalDate currenDate = LocalDate.now();
        Period period = Period.between(localDate, currenDate);
        return period.getYears() < 18;
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
        if (validate(string, regex)) {
            System.out.println("Invalid phone number");
        }
        return validate(string, regex);
    }

    public boolean validateGender(String string) {
        regex = "Female|Male|male|female|Gay|gay";
        if (validate(string, regex)) {
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
        regex = "[a-z0-9]+@[a-z]+\\\\.[a-z]{2,3}";
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
}
