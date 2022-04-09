package math_problems;

import java.lang.reflect.Array;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6}; //9


        System.out.println(missingNum(array));
    }

    public static int missingNum(int[] nums) {
        int n = nums.length;// 9
        int sum = ((n+1)*(n+2))/2;//55

        for(int i=0; i<n; i++) // i < 9, iterate 9 times
        sum -= nums[i]; // subtrack all numbers in array from 55.
        return sum;
    }

    }

