package com.purbashis;
//Write a Java program to remove duplicates from an array.


import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {255,99,66,55,255,66,55,1,2,3,65,45,2,1};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        int[] uniqueArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) { // Check for adjacent duplicates
                uniqueArr[j++] = arr[i];
            }
        }
        uniqueArr[j++] = arr[arr.length - 1];
        int[] finalArr = new int[j];
        int k = 0;
        for (int i = 0; i < j; i++) {
            if (uniqueArr[i] != 0) { // Skip adding zeroes
                finalArr[k++] = uniqueArr[i];
            }
        }
        return Arrays.copyOfRange(finalArr, 0, k); // Return a copy of the final array without trailing zeroes
    }
}

/*
The main method creates an integer array called arr with some values and calls the removeDuplicates method with this array as an argument.
The removeDuplicates method first sorts the input array using the Arrays.sort method. This is done to group together any duplicate values in the array, which makes it easier to remove them.
An empty integer array called uniqueArr is created with the same length as the input array to hold the unique values. A counter variable j is also initialized to zero.
A for loop is used to iterate over the input array from the first element to the second-to-last element. Inside the loop, it checks if the current element is not equal to the next element. If they are not equal, then the current element is added to the uniqueArr array using the j counter variable to keep track of the current index. If they are equal, the current element is skipped.
After the loop completes, the last element in the input array is added to uniqueArr since it was not included in the previous loop.
A new integer array called finalArr is created with the length of the number of unique values stored in uniqueArr. The finalArr array is then populated with the values from uniqueArr.
The finalArr array is returned from the removeDuplicates method and printed in the main method using the Arrays.toString method.
Overall, the code removes duplicates from an integer array and returns an array containing only the unique values. It does this by sorting the array, iterating over it to find and add unique elements to a new array, and then returning the new array.
 */
