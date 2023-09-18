package ss11.exercise;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class ReversingElementAndString {
    private static void primeStack(){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int length;
        do {
            System.out.println("Enter the length array");
            length= scanner.nextInt();
            if (length>0&&length<10){
                break;
            }else {
                System.out.println("You need enter the sheet length from 0 to 10");
            }
        }while (true);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the elements" + i + " in array");
            array[i]= scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Before reversing elements: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("After reversing");
        System.out.println(Arrays.toString(array));
    }
    private static void stringStack(){
        Scanner scanner= new Scanner(System.in);
        Stack<String> stackString = new Stack<>();
        System.out.println("Enter a String:");
        String string=scanner.nextLine();
        String[] afterString=string.split(" ");
        for (int i = 0; i < afterString.length; i++) {
            stackString.push(afterString[i]);
        }
        String beforString="";
        System.out.println("Before reversing string: " +string);
        for (int i = 0; i < afterString.length; i++) {
            beforString += stackString.pop();
            if(!stackString.isEmpty()){
                beforString += " ";
            }
        }
        System.out.println("After reversing " + beforString );

    }

    public static void main(String[] args) {
        ReversingElementAndString reverse = new ReversingElementAndString();
        reverse.primeStack();
        reverse.stringStack();
    }


}
