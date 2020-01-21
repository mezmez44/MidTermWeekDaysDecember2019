package problemandsolutions;

import org.apache.poi.util.SystemOutLogger;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        ArithmeticOperator.addition();
        ArithmeticOperator.subtraction();
        ArithmeticOperator.multiplication();
        ArithmeticOperator.divison();



    }
    public static void addition(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number a:");
        int a= input.nextInt();
        System.out.println("enter number b:");
        int b= input.nextInt();


        int c= a+b;

        System.out.println("total addition is:" +c);



        System.out.println("===========================");


    }

    public static void subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number a:");
        int a= input.nextInt();
        System.out.println("enter number b:");
        int b= input.nextInt();


        int c= a-b;

        System.out.println("total substraction is:" +c);

        System.out.println("===========================");

    }
    public static void multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number a:");
        int a= input.nextInt();
        System.out.println("enter number b:");
        int b= input.nextInt();


        int c= a*b;

        System.out.println("total multiplication is:" +c);


        System.out.println("===========================");


    }
    public static void divison(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number a:");
        int a= input.nextInt();
        System.out.println("enter number b:");
        int b= input.nextInt();


        int c= a/b;

        System.out.println("total division is:" +c);



        System.out.println("===========================");


    }


}
