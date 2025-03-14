/*
You are given an array arr of integers. Your task is to check if there exist two distinct indices i and j such that arr[i] is exactly half of arr[j].

Return true if such a pair exists, and false otherwise.
*/

import java.util.Scanner;

public class HasHalf {
    public static boolean hashalf(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==2*arr[j] || arr[j]==2*arr[i])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            
            int[] arr=new int[n];    
            System.out.println("enter the array elements");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println(hashalf(arr,n));
    }
}
