import java.util.*;
public class addwithoutplus {
    public static int ADDITION(int a,int b)
    {
        //updataion till no carry remains
        while(b!=0)
        {

            int carry=(a&b)<<1;

            //add without carry
            a=a^b;

            //add with carry
            b=carry;
        }
        return a;

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        int sum=ADDITION(a, b);
        System.out.println("Sum without '+':"+sum);


    }
    
}
