package mvc_lamthem.ultils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private String regex;

    public boolean validate(String regex, String REGEX) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateId(String string) {
        regex = "^(NV-)+[0-9]{4}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid id");
        }
        return validate(string, regex);
    }

    public boolean validateName(String string) {
        regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!validate(string, regex)) {
            System.out.println("Invalid  name");
        }
        return validate(string, regex);
    }

    public boolean validateIdentificationCard(String string) {
        regex = "^[0-9]{9}|[0-9]{12}$";
        if (!validate(string, regex)) {
            System.out.println("Invalid  identification card");
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

    public boolean validateEmail(String string) {
        regex = "(([a-zA-Z0-9]+)(.[a-zA-Z0-9]+)*@gmail.com)$";
        if (!validate(string, regex)) {
            System.out.println("Not a email");
        }
        return validate(string, regex);
    }


}
