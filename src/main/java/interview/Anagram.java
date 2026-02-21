package interview;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        areAnagrams(str1,str2);
    }
    public static void areAnagrams(String str1, String str2)
    {
        int[] alphaCount=new int[26];
        if(str1.length()!=str2.length())
        {
            System.out.println("not anagrams");
            return;
        }
            for (int i=0;i<str1.length();i++)
            {
                char ch= str1.charAt(i);
                alphaCount[ch-'a']++;
            }
           for (int i=0;i<str2.length();i++)
         {
            char ch= str2.charAt(i);
            alphaCount[ch-'a']--;
        }
        for (int count : alphaCount) {
            if (count != 0) {
                System.out.println("Not anagrams");
                return;
            }
            
        }

        System.out.println("Anagrams");

    }
}