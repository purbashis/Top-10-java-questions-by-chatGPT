package com.purbashis;
//Write a Java program to sort an array in descending order.(using function)
import java.util.Arrays;
//Write a Java program to sort an array in descending order.

public class Sort_an_array_in_descending_order_using_function {
    public static void main(String[] args) {
        int [] arr= {9,66,88,44,22};
        int[] ans=descn(arr);
        System.out.println("the sorted descending array is  :"+ Arrays.toString(ans));


    }

    static int[] descn(int[] a) {
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
        return a;
    }

}
