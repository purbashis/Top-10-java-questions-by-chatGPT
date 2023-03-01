package com.purbashis;
//Write a Java program to implement a binary search algorithm.
import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int []arr= { 1,2,3,5,8,10,12,65,98,100,200};
        int target=98;
        System.out.println("the array is : "+Arrays.toString(arr));
        int ans=bs(arr,target);
        System.out.println("index is "+ ans);
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(start+end)-start;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
