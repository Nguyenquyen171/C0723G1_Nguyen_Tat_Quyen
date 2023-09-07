package ss3.thuchanh;

import java.util.Scanner;

public class NameStudent {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name student: ");
        String inputName= scanner.nextLine();
        String[] student= {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
