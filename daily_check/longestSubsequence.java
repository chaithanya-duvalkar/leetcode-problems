// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3
import java.util.*;
public class longestSubsequence {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        if(n<=0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int result=1,count=1;


        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i]==nums[i-1]+1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            result=Math.max(result,count);
        }
        return result;
    }
}

