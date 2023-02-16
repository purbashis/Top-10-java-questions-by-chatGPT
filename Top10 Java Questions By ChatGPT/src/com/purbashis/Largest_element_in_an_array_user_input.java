package com.purbashis;
//Write a Java program to find the largest element in an array user input .(done)

import java.util.Arrays;
import java.util.Scanner;

public class Largest_element_in_an_array_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:"+ Arrays.toString(arr));
        int ans = largestElement(arr);
        System.out.println("The largest element among these array : "+ans);

    }

     static int largestElement(int[] arr) {
        int max=0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max){
                 max=arr[i];
             }

         }
        return max;
    }


}
