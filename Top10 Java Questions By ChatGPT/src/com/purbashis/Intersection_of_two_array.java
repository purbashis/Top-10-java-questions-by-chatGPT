package com.purbashis;
//Write a Java program to find the intersection of two arrays.
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_two_array {
    public static void main(String[] args) {
        int [] arr1= {2,3,6,7,9,11};
        int [] arr2= {4,6,8,9,11,12};
        System.out.println("The 1st array is :"+ Arrays.toString(arr1));
        System.out.println("The 2nd  array is :"+ Arrays.toString(arr2));



        System.out.println("Intersection_of_two_array by using HashSet :");
        // by Using HashSet
        HashSet<Integer> set1= new HashSet<>();
        for (int val : arr1){
            set1.add(val);
        }
        for(int val: arr2){
            if (set1.contains(val)){
                System.out.println(val);
            }
        }



        // simple approach
        System.out.println("Intersection_of_two_array is : ");
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }

//2nd approach
        System.out.println("Intersection_of_two_array is : ");
        int i= 0;
        int j = 0;
        while (i<arr1.length && j< arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;

            }else if (arr1[i]>arr2[j]){
                j++;
            }
            else {
                i++;
            }

        }






    }
}
