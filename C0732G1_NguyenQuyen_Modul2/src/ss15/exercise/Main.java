package ss15.exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        IllegalTriangleException exception= new IllegalTriangleException();
        Scanner scanner=new Scanner(System.in);
        int numberA=0;
        int numberB=0;
        int numberC=0;
        do {
            try{
                do {
                    try {
                        System.out.println("Enter the number A");
                        numberA= Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e ){
                        System.out.println("Number A not a number");
                    }
                }while (numberA<=0);
                do {
                    try {
                        System.out.println("Enter the number B");
                        numberB= Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e ){
                        System.out.println("Number B not a number");
                    }
                }while (numberB<=0);
                do {
                    try {
                        System.out.println("Enter the number C");
                        numberC= Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e ){
                        System.out.println("Number C not a number");
                    }
                }while (numberC<=0);
                exception.checkInputEdge(numberA,numberB,numberC);
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }
        }while (numberA + numberB <= numberC || numberA + numberC <= numberB || numberB + numberC <= numberA);
    }

}
