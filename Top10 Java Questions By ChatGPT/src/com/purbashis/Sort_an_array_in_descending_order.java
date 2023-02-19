package com.purbashis;

import java.util.Scanner;

public class Sort_an_array_in_descending_order {
    public static void main(String[] args) {

        int [] a = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 5 array elements ");
        for (int i = 0; i <a.length ; i++) {
            a[i]= in.nextInt();

        }
        //logic
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <a.length ; j++) {
                {
                    if(a[i]<a[j]){
                        int temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }

            }
        }
        System.out.println("The descending sorted array is :  ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");

        }

    }




}
