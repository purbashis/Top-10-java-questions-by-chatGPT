package com.purbashis;
//Write a Java program to check if a given string is a palindrome or not.

public class Check_given_string_Palindrome_or_not {
    public static void main(String[] args) {
        String a = "Racecar";
        System.out.println("The string is : "+ a );
        boolean ans =Pal(a);
        if(ans){
            System.out.println("The given String "+a +" is Palindrome." );

        }else {
            System.out.println("The given String "+a +" is  not Palindrome." );

        }
    }

  static boolean Pal(String a) {
        int right=0;
        int left = a.length()-1;
        while (left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right++;
        }
        return true;

    }
}
