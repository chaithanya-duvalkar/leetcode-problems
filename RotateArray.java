/*
189. Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/
import java.util.Scanner;

public class RotateArray {
        public static void rotate(int[] nums, int k) {
            
           int n=nums.length;
           k%=n;
    
           reverse(nums,0,n-1);  //reverse all the n elements 
    
           reverse(nums,0,k-1);  //reverse first k elements
    
           reverse(nums,k,n-1);  //reverse next remaining elements
    
        }
    
        public static void reverse(int nums[],int start,int end)
        {
                while(start < end)
                {
                    int temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }
        }

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n,k;
            System.out.println("enter n");
            n=sc.nextInt();
    
            int[] nums=new int[n];
            System.out.println("enter the elements");
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }

            System.out.println();

            System.out.println("array");
            for(int i=0;i<n;i++)
            {
                System.out.print(nums[i]+" ");
            }

            System.out.println();

            System.out.println("enter k");
            k=sc.nextInt();
            
            rotate(nums,k);

            
            System.out.println("array after rotation");
            for(int i=0;i<n;i++)
            {
                System.out.print(nums[i]+" ");
            }
            System.out.println();
    }
}
