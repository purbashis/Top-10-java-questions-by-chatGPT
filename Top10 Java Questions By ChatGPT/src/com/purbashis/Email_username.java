package com.purbashis;

/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */

import java.util.Scanner;

public class Email_username {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = getUserName(email);
        System.out.println(userName);
    }

    public static String getUserName(String email) {
        String userName = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        return userName;
    }
}
