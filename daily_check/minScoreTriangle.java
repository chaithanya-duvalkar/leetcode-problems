public class minScoreTriangle {
    public int MinScoreTriangle(int[] nums)
    {
        int n=nums.length;
        int[][] dp=new int[n][n];

        for(int gap=2;gap<n;gap++)
        {
            for(int i=0;gap+i<n;i++)
            {
                int j=i+gap;
                dp[i][j]=Integer.MAX_VALUE;

                for(int k=i+1;k<j;k++)
                {
                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]+nums[i]*nums[j]*nums[k]);
                }
            }
        }
        return dp[0][n-1];
    }
     public static void main(String[] args) {
        minScoreTriangle sol = new minScoreTriangle();

        int[] values1 = {1, 2, 3};  
        System.out.println("Minimum Score: " + sol.MinScoreTriangle(values1));
        // Expected = 6  (only one triangle 1*2*3)

        int[] values2 = {3, 7, 4, 5};
        System.out.println("Minimum Score: " + sol.MinScoreTriangle(values2));
        // Expected = 144  (triangles chosen to minimize total score)

        int[] values3 = {1, 3, 1, 4, 1, 5};
        System.out.println("Minimum Score: " + sol.MinScoreTriangle(values3));
        // Expected = 13
    }
}
