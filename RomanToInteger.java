//

import java.util.*;

public class RomanToInteger {
    public static int romanTointeger(String s)
    {
        int[] romanValue=new int[26]; //alphabet values stored in array format

        //assigning integer values to roman values by subtracting the ASCII value of 'A' from the respective roman value 
        romanValue['I'-'A']=1;
        romanValue['V'-'A']=5;
        romanValue['X'-'A']=10;
        romanValue['L'-'A']=50;
        romanValue['C'-'A']=100;
        romanValue['D'-'A']=500;
        romanValue['M'-'A']=1000;

        int result=0; //store result
        int prevVal=0; //store prevValue

        //to read the given string array of roman values and convert into integer value after addition or subtraction
        for(int i=s.length()-1;i>=0;i--)
        {
            int currentVal=romanValue[s.charAt(i)-'A']; //store currentValue from the input and convert it into integer
            if(currentVal<prevVal)
            {
                result-=currentVal;   //subtraction
            }
            else
            {
                result+=currentVal;  //addition
            }
            prevVal=currentVal;  //updating the prevValue by currentValue 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roman=sc.nextLine();

        System.out.println(romanTointeger(roman));
    }
}
