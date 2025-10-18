// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

public class reverseVowels{
    public static String reversevowels(String s)
    {
        String vowels="aeiouAEIOU";
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j)
        {
            if(vowels.indexOf(arr[i])==-1)
            {
                i++;
            }
            else if(vowels.indexOf(arr[j])==-1)
            {
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[i];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}