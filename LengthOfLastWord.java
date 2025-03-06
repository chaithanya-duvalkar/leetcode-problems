/*
58. Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

*/

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        int length=0;
        int i=s.length()-1;

        while( i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }
        
        while( i >= 0 && s.charAt(i) != ' ')
        {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        int l=lengthOfLastWord(s);
    }
    
}

