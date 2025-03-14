public class ClimbingStairs {

        public int climbStairs(int n) {
            if(n==1) return n;
    
            int prev1=1;
            int prev2=2;
    
            for(int i=3;i<=n;i++)
            {
                int temp=prev1+prev2;
                prev1=prev2;
                prev2=temp;
            }
            return prev2;
        }
    
}
