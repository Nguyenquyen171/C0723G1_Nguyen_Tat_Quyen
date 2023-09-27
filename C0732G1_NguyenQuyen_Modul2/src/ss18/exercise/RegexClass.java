package ss18.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static boolean validateClass(String regex,String REGEX){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String className;
        Scanner scanner=new Scanner(System.in);
        final String CLASS_REGEX="[^A|C|P]+[0-9]{4}+[^G|H|I|K]$";
        do{
            System.out.println("Enter the class name according to format [C0732G1]");
            className= scanner.nextLine();
            if (validateClass(className,CLASS_REGEX)){
                System.out.println("Your class is "+ className);
            }else {
                System.out.println("Bạn thất học mời bạn nhập lại lớp cho có học");
            }
        }while (!validateClass(className,CLASS_REGEX));
    }
}
