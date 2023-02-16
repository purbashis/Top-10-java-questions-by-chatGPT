package com.purbashis;
//Write a Java program to reverse a given string.

public class Reverse_the_string {
    public static void main(String[] args) {
    String a = "LOVE";
        System.out.println("the string is :"+a );
    String ans=Rev(a);
        System.out.println("the reverse string is "+ ans);
    }

    //by using String Builder
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
