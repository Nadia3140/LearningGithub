package practice;

import java.util.Scanner;

public class ReadDataFromTerminal {

    //Using Scanner Class, you can write a program that will allow the user to provide input from the terminal

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String s = in.nextLine();
        System.out.println("you entered string: " + s);

        System.out.println("Enter your age: ");
        int a = in.nextInt();
        System.out.println("you entered integer: " + a);

        System.out.println("Enter your name shirt price: ");
        float b = in.nextFloat();
        System.out.println("you entered string: " + b);
    }
}
