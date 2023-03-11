package com.purbashis;



//Check if two arrays are equal or not

import java.util.*;
class Array_equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        System.out.println("Enter elements of array A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        System.out.println("Enter elements of array B: ");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }
        boolean result = check(A, B, N);
        if (result) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }

    //Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int N) {
        // Sort the arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // Check if the two arrays are equal using the Arrays.equals method
        if (Arrays.equals(A, B)) {
            return true;
        } else {
            return false;
        }
    }
}
