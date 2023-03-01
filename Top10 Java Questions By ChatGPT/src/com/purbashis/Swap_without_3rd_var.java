package com.purbashis;
//Write a Java program to swap two numbers without using a third variable.
import java.util.Scanner;

public class Swap_without_3rd_var {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int [] swapvalues=Swap(a,b);
        System.out.println("after swapping "+ swapvalues[0]+"   "+swapvalues[1]);
    }
    static int []  Swap(int a , int b){
        int[] result =new int[2];
        a=a+b;
        b=a-b;
        a=a-b;
        result[0]=a;
        result[1]=b;
        return result;
    }
}
