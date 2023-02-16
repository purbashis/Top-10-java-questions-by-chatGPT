package com.purbashis;
//Write a Java program to check if a given(user input) string is a palindrome or not .(done)
import java.util.Scanner;

public class Check_given_string_Palindrome_or_not_user_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = in.nextLine();
        System.out.println("The string is : " + a);
        boolean ans = chkPal(a);
        if (ans) {
            System.out.println("The given String " + a + " is Palindrome.");

        } else {
            System.out.println("The given String " + a + " is  not Palindrome.");

        }
    }

    static boolean chkPal(String a) {

        int right=0;
        int left = a.length()-1;
        while (right<left){
            if(a.charAt(right)!=a.charAt(left)){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
