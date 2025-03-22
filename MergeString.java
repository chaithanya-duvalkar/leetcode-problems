
import java.util.*;

public class MergeString {
    public static String mergestringAlternatively(String word1,String word2)
    {
        StringBuilder result=new StringBuilder(); // Using StringBuilder for efficient string manipulation
        int i=0,j=0; 

        while(i<word1.length() || j<word2.length())
        {
            if(i<word1.length())
            {
                result.append(word1.charAt(i++));
            }
            if(j<word2.length())
            {
                result.append(word2.charAt(j++));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();

        System.out.println(mergestringAlternatively(word1, word2));
    }
}
