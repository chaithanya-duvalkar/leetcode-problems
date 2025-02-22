/*
53. Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.
 */

public class MaxSubArray {
        public int maxSubArray(int[] nums) {
            int max_sum=nums[0];
            int current_sum=0;
    
            for(int i=0;i<nums.length;i++)
            {
                if(current_sum<0)
                {
                    current_sum=0;
                }
                current_sum=current_sum+nums[i];
                max_sum=Math.max(current_sum,max_sum);
            }
            return max_sum;
        }
}
