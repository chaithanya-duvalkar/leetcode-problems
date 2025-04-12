/*
338. Counting Bits
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
 ans[i] is the number of 1's in the binary representation of i.
Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */

public class CountBitsiTOn {
    
        public int[] countBits(int n) {
            int[] ans=new int[n+1]; //new array which contains no_of 1's from i=0 to i=n
            int n1,n2;
            for(int i=1;i<=n;i++)  //first bit is always 0, so i starts from 1
            {
               ans[i]=ans[i>>1]+(i&1);
            }
            return ans;
        }

}
