import java.util.Scanner;

public class ReverseBit {
    
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++)
        {
            result=result<<1;
            result=result|(n&1);
            n=n>>1;
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverseBits(n));
    }
}
