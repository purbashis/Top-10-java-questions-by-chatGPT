package com.purbashis;
//Write a Java program to find the factorial of a given number.
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();
        long factorial = calculateFactorial(num);
        System.out.printf("Factorial of %d is %d", num, factorial);
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        if (num == 0) {
            return 1;}else {
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }}
}
