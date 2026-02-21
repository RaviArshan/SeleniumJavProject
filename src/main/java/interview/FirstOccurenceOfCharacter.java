package interview;

import java.util.Arrays;
import java.util.HashMap;

public class FirstOccurenceOfCharacter {
    public static void main(String[] args) {
        String str="ravira";
        int j=firstNonRepeatingCharacter(str);
        System.out.println(j);
    }
     public static int firstNonRepeatingCharacter(String str)
     {
         char[] ch=str.toCharArray();
         int[] freq=new int[26];
         for (int i=0;i<str.length();i++)
         {
              freq[ch[i]-'a']++; //a=97
         }
         for(int i=0;i<ch.length;i++)
         {
             if(freq[ch[i]-'a']==1)
             {
                 return i;
             }
         }
         return 0;

     }

}
