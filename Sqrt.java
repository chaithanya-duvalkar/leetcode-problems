/*
69. Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */


public class Sqrt {
    
        public int mySqrt(int x) {
           /* int i=0;
            while((long)i*i<=x)
            {
                i++;
            }
            return i-1;
            */
            if(x==0 || x==1)
                return x;
    
            int left=1,right=x,result=0;
            while(left<=right)
            {
                int mid=(left+right)/2;
    
                if(mid<=x/mid)
                {
                    result=mid;
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            return result;
        }
    
}
