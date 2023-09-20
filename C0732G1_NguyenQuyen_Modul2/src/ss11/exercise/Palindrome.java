package ss11.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.addFirst(c);
        }
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.removeFirst()) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str)); // true


        str = "hello";
        System.out.println(isPalindrome(str)); // false
    }

}