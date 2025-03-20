/* guess number higher or lower
374. We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
 */

import java.util.*;

class GuessGame{
    private int pick;

    public GuessGame(int pick)
    {
        this.pick=pick;
    }

    public int guess(int nums)
    {
        if(nums>pick)
            return -1;
        if(nums<pick)
            return 1;
        return 0;    
    }
}
public class GuessNumber extends GuessGame {   

    public GuessNumber(int pick)
    {
        super(pick);
    }

    public int guessnumber(int n)
    {
        int start=1,end=n;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int result=guess(mid);
            if(result==0)
            {
                return mid;
            }
            else if(result==-1)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int pick=sc.nextInt();

        GuessNumber game=new GuessNumber(pick);
        System.out.println(game.guessnumber(n));

    }
}
