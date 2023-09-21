package ss13.exercise;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class LengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        String result = "";

        List<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            List<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > ((LinkedList<Character>) list).getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println();
        System.out.println("The longest ascending sorted string is: ");
        for (Character chaz : max) {
            System.out.print(chaz);
        }
    }
}
