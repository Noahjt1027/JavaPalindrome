package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Palindrome myPalindrom = new Palindrome();
    System.out.println("Please enter a sentence to check if its a palindrom: \n");
    String myString = scan.nextLine(); //Get input
    myPalindrom.inputStr(myString); //insert string into class
    myPalindrom.check(); //check if palindrome



    }
}
