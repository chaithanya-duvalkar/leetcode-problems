/*
918. Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
*/

public class MaxCircularSubArray {

        public int maxSubarraySumCircular(int[] nums) {
            int max_kadane=kadane(nums);// To Find the maximum subarray sum normally
            int total_sum=0;
    
            for(int i=0;i<nums.length;i++)
            {
                total_sum+=nums[i]; // Compute the total sum of the array
                nums[i]=-nums[i]; // Invert the array for finding the min subarray sum
            }
    
            int min_kadane=kadane(nums); //Find the minimum subarray sum using Kadane's
            int max_circular=total_sum+min_kadane;  //Compute circular subarray sum

            //If all numbers are negative, return max_kadane directly
            return (max_circular==0)?max_kadane:Math.max(max_kadane,max_circular);
        }
        
        private int kadane(int[] nums) {
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
