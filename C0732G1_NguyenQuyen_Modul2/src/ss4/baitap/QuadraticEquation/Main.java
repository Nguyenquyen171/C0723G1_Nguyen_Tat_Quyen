package ss4.baitap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("Enter the number A");
            a = scanner.nextDouble();
            if (a != 0) {
                break;
            } else {
                System.out.println("You need to enter number A other than 0 ");
            }
        } while (true);
        System.out.println("Enter the number B");
        double b = scanner.nextDouble();
        System.out.println("Enter the number C");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no solution");
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The euqations has double solution x1,x2: " + equation.root1());

        } else if (equation.getDiscriminant() > 0) {
            System.out.println("The euqations has distinct solutions x1: " + equation.root1() + " and x2: " + equation.root2());

        }
    }
}
