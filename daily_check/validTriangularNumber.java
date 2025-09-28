// Given an integer array nums, return the number of triplets chosen from the array that can make triangles 
// if we take them as side lengths of a triangle.
// Example 1:

// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3
// Example 2:

// Input: nums = [4,2,3,4]
// Output: 4


import java.util.*;

public class validTriangularNumber {
    public static int triangularNumber(int[] nums)
    {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);

        for(int k=n-1;k>=2;k--)
        {
            int i=0;
            int j=k-1;
            while(i<j)
            {
                if(nums[i]+nums[j]>nums[k])
                {
                    count+=(j-i);
                    j--;
                }
                i++;
            }
        }
        return count;

    }

     public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        System.out.println(triangularNumber(nums)); // Expected output: 3
    }
}
