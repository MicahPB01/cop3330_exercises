package oop.example;


//figure 2.1: Welcome1.java
//text printing program

import java.util.Scanner;



public class Welcome1 {
    //main method
    public static void main(String[] args)   {
        Scanner testString = new Scanner(System.in);
        System.out.println("Enter UserName");

        String userName = testString.nextLine();
        System.out.println("userName is " + userName);
        System.out.print("The length of the username is " +  userName.length());



        System.out.print("Welcome to Java Programming");
        System.out.print("Welcome to Java Programming");
        System.out.println("Welcome to Java Programming");
    }

}
