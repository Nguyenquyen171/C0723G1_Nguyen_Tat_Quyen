package ss15.exercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message) {
        super(message);
    }
    public IllegalTriangleException(){

    }

    public void checkInputEdge(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Error:2 sides are not larger than the other side!, please try again");
        } else {
            System.out.println("Create 3 sides of a valid angle");
        }
    }
}
