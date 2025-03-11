/*
66.You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digit
 */
import java.util.Scanner;

public class PlusOne {
    public static int[] onePlus(int[] digits)
    {
        int n=digits.length;

        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newdigits[]=new int[n+1];
        newdigits[0]=1;
        return newdigits;
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int[] digits=new int[n];
        for(int i=0;i<n;i++)
        {
            digits[i]=sc.nextInt();
        }

        int[] newdigits=onePlus(digits);
        System.out.print("[ ");
        for(int num:newdigits)
        {
            System.out.print(num+" ");
        }
        System.out.print("]");
    }
}
