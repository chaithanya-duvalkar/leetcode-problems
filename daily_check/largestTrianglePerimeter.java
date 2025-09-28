// Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, 
// formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

// Example 1:

// Input: nums = [2,1,2]
// Output: 5
// Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
// Example 2:

// Input: nums = [1,2,1,10]
// Output: 0
// Explanation: 
// You cannot use the side lengths 1, 1, and 2 to form a triangle.
// You cannot use the side lengths 1, 1, and 10 to form a triangle.
// You cannot use the side lengths 1, 2, and 10 to form a triangle.
// As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.

import java.util.*;
public class largestTrianglePerimeter 
{
    public static int largesttriangleperimeter(int[] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=n-1;i>=2;i--)
        {
            if(nums[i-1]+nums[i-2]>nums[i])
            {
                return nums[i-1]+nums[i-2]+nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2};
        int[] nums2 = {1, 2, 1};
        int[] nums3 = {3, 2, 3, 4};
        int[] nums4 = {3, 6, 2, 3};

        System.out.println("Largest Perimeter (nums1): " + largesttriangleperimeter(nums1)); // 5
        System.out.println("Largest Perimeter (nums2): " + largesttriangleperimeter(nums2)); // 0
        System.out.println("Largest Perimeter (nums3): " + largesttriangleperimeter(nums3)); // 10
        System.out.println("Largest Perimeter (nums4): " + largesttriangleperimeter(nums4)); // 8
    }
    
}
