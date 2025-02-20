/*
80. Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element 
appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the 
first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements 
of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

*/
import java.util.*;

public class DuplicateII {

        public static int removeDuplicates(int[] nums) {
    
            int n=nums.length;
            if(n<=2)
                return n;    // If array has 2 or fewer elements, return as is.
            int k=2;          // Start inserting from index 2
    
            for(int i=2;i<n;i++)
            {
                if(nums[i]!=nums[k-2])     // Allow at most two occurrences
                {
                    nums[k]=nums[i];
                    k++;
                }
            } 
            return k;   
            
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            
            int nums[]=new int[n];
            System.out.println("enter elements");
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
    
            int k=removeDuplicates(nums);
    
            System.out.println("number of unique elements:"+k);
            System.out.println("modified array");
            for(int i=0;i<k;i++)         // Print only the first k elements
            {
                System.out.print(nums[i]+" ");
            }
            
        }
    }
