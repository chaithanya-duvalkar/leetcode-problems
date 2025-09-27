public class largestTriangleArea {
    public double largesttrianglearea(int[][] points){
        int n=points.length;
        double max=0.0;

        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    double area=triangleArea(points[i],points[j],points[k]);
                    max=Math.max(area,max);
                }
            }
        }
        return max;
    }

    private double triangleArea(int[] p1,int[] p2,int[] p3)
    {
         return 0.5*Math.abs(p1[0]*(p2[1]-p3[1])+p2[0]*(p3[1]-p1[1])+p3[0]*(p1[1]-p2[1]));
    }

     public static void main(String[] args) {
        largestTriangleArea obj = new largestTriangleArea();
        int[][] points = {{0,0}, {0,1}, {1,0}, {0,2}, {2,0}};  
        System.out.println("Largest Triangle Area = " + obj.largesttrianglearea(points));

        // output--> Largest Triangle Area = 2.0

    }
}
