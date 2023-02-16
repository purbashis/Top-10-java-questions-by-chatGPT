package com.purbashis;

import java.util.Arrays;

//Write a Java program to find the largest element in an array.(done)
public class Largest_element_in_an_array {
    public static void main(String[] args) {
        int []a = { 200,5,9,788,45,66,800,480};
        int ans = largest_Element(a);
        System.out.println("the array is : "+Arrays.toString(a));
        System.out.println("the largest element of this array is : "+ ans);

    }

static int largest_Element(int[] a) {
        int max=0;
    for (int i = 0; i < a.length; i++) {
      if( a[i]>max){
          max=a[i];
      }
    }
    return  max;
    }


}