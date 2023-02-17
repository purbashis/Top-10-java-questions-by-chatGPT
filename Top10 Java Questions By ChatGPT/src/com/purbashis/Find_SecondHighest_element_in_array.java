package com.purbashis;
//Write a Java program to find the second-largest number in an array.(done)
import java.util.Arrays;

public class Find_SecondHighest_element_in_array {
    public static void main(String[] args) {
        // 1,20,5,6,16,10
        //1,5,6,10,16,20(sort the array first )
        //arr.length-2
        //answer  should be 16

        int [] arr = {1,20,5,6,16,10};
        System.out.println("The array is : "+Arrays.toString(arr));
        Arrays.sort(arr);//sort the array in ascending  order
        System.out.println("After sorting the Array :" + Arrays.toString(arr));
        System.out.println("The highest element in this Array is : "+arr[arr.length-1]);
        System.out.println("The second highest element in this array  : "+arr[arr.length-2]);
        System.out.print("Reverse of this  array :");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");
        }


    }
}
