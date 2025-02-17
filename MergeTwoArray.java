/*
 88. You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */



import java.util.*;

class MergeTwoArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int i=m-1;          // Pointer for last element of nums1
        int j=n-1;           // Pointer for the last position in nums1
        int k=m+n-1;         // Pointer for last element of nums2
        
        // Merge from the end
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
       /*
        while(i<m){
            nums1[k++]=nums1[i++];
        }
        */


        // Copy any remaining elements of nums2 into nums1
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }

    /*
    public static void printarray(int[] mergedarray)
    {
        for(int num:mergedarray)
        {
            System.out.print(num+" ");
        }
    }
    */

    public static void main(String args[]){

            Scanner sc=new Scanner(System.in);

            System.out.println("enter m");
            int m=sc.nextInt();
            System.out.println("enter n");
            int n=sc.nextInt();
            
            int[] nums1=new int[m+n];    // nums1 has extra space for merging
            System.out.println("enter the first array");
            for(int i=0;i<m;i++)
            {
                nums1[i]=sc.nextInt();
            }

            int[] nums2=new int[n];
            System.out.println("enter the second array");
            for(int i=0;i<n;i++)
            {
                nums2[i]=sc.nextInt();
            }
           
            // Merge nums2 into nums1
            merge(nums1,m,nums2,n);

            // Print merged nums1
            System.out.println("merged array");
            for(int nums:nums1)
            {
                System.out.print(nums+" ");
            }

        //printarray(mergedarray);
        sc.close();
    }
}