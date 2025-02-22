/*
169. Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

*/
import java.util.*;

public class MajorityElement {

        public static int majorityElement(int[] nums) {
    
            // Initialize the first element as the candidate and set count to 1
            int count=1;
            int k=nums[0];
    
             // Iterate through the array starting from index 1
            for(int i=1;i<nums.length;i++)
            {
                // If the current element matches the candidate, increment the count
                // Otherwise, decrement the count
                count=(nums[i]==k)?count+1:count-1;    //this can be written using if-else block
                
                // If count becomes zero, update the candidate to the current element and reset count
                if(count==0)
                {
                    k=nums[i];
                    count=1;
                }
            }
            return k;   // The candidate at the end is the majority element
        }

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("enter n");
            n=sc.nextInt();
    
            int[] nums=new int[n];
            System.out.println("enter the elements");
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            
            int k=majorityElement(nums);

            System.out.println("majority element:"+k);
    }
}

