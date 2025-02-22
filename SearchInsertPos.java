/*
35. Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

public class SearchInsertPos {
        public int searchInsert(int[] nums, int target) 
        {
            int start=0;
            int end=nums.length-1;
    
            while(start<=end)
            {
                int mid=(start+end)/2;
    
                if(nums[mid]==target)
                {
                    return mid;         //return target
                }
                else if(nums[mid]<target)
                {
                    start=mid+1;  //search right half
                }
                else
                {
                    end=mid-1;     //search right half
                }
            }
            return start;
        }  
}
