public class TrapRainWater {
    
        public static int trap(int[] height) {
            int n=height.length;
            int[] left_max=new int[n];
            left_max[0]=height[0];
    
            for(int i=1;i<n;i++)
            {
                left_max[i]=Math.max(height[i],left_max[i-1]);
            }
    
            int[] right_max=new int[n];
            right_max[n-1]=height[n-1];
    
            for(int i=n-2;i>=0;i--)
            {
                right_max[i]=Math.max(height[i],right_max[i+1]);
            }
    
            int trappedwater=0;
    
            for(int i=0;i<n;i++)
            {
                int waterlevel=Math.min(right_max[i],left_max[i]);
    
                trappedwater+=waterlevel-height[i];
            }
    
            return trappedwater;
    
        }
    
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
            int height[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                height[i]=sc.nextInt();
            }
            int trap=trap(height);
    
        }    
}
