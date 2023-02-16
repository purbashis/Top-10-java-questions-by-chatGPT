package com.purbashis;
//Write a Java program to reverse a given(user input ) string.

import java.util.Scanner;

public class Reverse_the_string_user_input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String xx= in.nextLine();
        String answer =Rev(xx);
        System.out.println("The reverse String is : "+ answer);


    }
    static String Rev(String a) {
        StringBuilder  x = new StringBuilder(a);
        String ans = String.valueOf(x.reverse());
        return ans;

    }
    //here we  use charAt()
    static  String Rev2(String a ){
        String ans="";
        for (int i =a.length()-1;i>=0;i--)
        {
            ans=ans+a.charAt(i);
        }

        return ans;
    }

    //here we used character  array
    static String Rev3 (String a){
        char[]b = a.toCharArray();
        String ans="";
        for (int i =b.length-1 ; i >=0 ; i--) {
            ans=ans+b[i];

        }
        return ans;
    }
}
