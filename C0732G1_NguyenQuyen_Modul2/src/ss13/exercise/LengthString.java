package ss13.exercise;
import java.util.LinkedList;
import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter the String");

        for (char ch : input.nextLine().toCharArray()) {
            if (list.size() > 1 && ch <= list.getLast() && list.contains(ch)) {
                list.clear();
            }
            list.add(ch);
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (char ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }


}
