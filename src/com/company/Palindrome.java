package com.company;
/*
Creator:Noah Taylor
Class: Palindrome
Use: To check if a sentence is a palindrome

 */
public class Palindrome {
    private String myString;

    //Constructor
    public Palindrome() {
        myString = "";
    }

    /*
    Creator: Noah Taylor
    Function: palindromeCheck()
    Parameters: n/a
    Result: 1 if palindrome, 0 if not a palindrome
     */
    private int palidromeCheck() {
        int start = 0; //start index
        int end = myString.length()-1; //end index
        int success = 1;
        if (end > 1) { //If its more than 1 in length
            while (start < end) {
                if (myString.charAt(start) != myString.charAt(end)) { //Check the first and last index
                    success = 0;
                }
                start++; //move first index forward
                end--; //moce end index backwards
            }
        }

        return success;

    }

    /*
    Creator: Noah Taylor
    Function: inputStr()
    Parameters: String x
    Result: myString = x, no return
     */
    public void inputStr(String x) {
        myString = x.toLowerCase();
    }

    /*
    Creator: Noah Taylor
    Function: check()
    Parameters: n/a
    Result: prints statement to console based on palindromeCheck()
     */
    public void check(){
        int success = palidromeCheck();
        if (success == 1){
            System.out.println("\nThat was a palindrome!");
        }
        else{
            System.out.println("\nThat was not a palindrome.");
        }
    }
}

