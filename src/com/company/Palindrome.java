package com.company;

public class Palindrome {
    private String myString;

    public Palindrome() {
        myString = "";
    }

    private int palidromeCheck() {
        int start = 0;
        int end = myString.length()-1;
        int success = 1;
        if (end > 1) {
            while (start < end) {
                if (myString.charAt(start) != myString.charAt(end)) {
                    success = 0;
                }
                start++;
                end--;
            }
        }

        return success;

    }

    public void inputStr(String x) {
        myString = x.toLowerCase();
    }

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

