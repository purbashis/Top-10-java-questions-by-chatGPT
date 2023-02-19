package com.purbashis;
//https://leetcode.com/problems/two-sum/





import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int [] arr = { 2,7,6,10,30};
        int ta=9;//target element 9
        System.out.println("The array is given : "+ Arrays.toString(arr));
        System.out.println("The Two sum of target is  :"+ ta);
        int [] ans = twoSum(arr,ta);
        System.out.println("The index values to get the TWO SUM is  : "+ Arrays.toString(ans));

    }
    static  int [] twoSum(int[] nums ,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
       //Fill HM
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);

        }


        //searching
        for (int i = 0; i < nums.length; i++) {

            int num= nums[i];
            int remaining= target - num;
            if(map.containsKey(remaining)){
                int index = map.get(remaining);
                if (index==i)continue;
                return  new int[]{i,index};
            }

        }
        return new int [] {};


    }
    //time complexity  : O(1)
//Space complexity : O(1)

}
