package thi_tot.file_utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsFile {

    public static List<String> readFile(String pathName) {
        File file = new File(pathName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> result = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                result.add(string);
            }
            return result;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static void writeFile(String pathName, List<String> strings) {
        File file;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(pathName);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : strings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

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
