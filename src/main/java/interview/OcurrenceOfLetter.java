package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OcurrenceOfLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: "); // Shravani
        String str = sc.nextLine();
        letterOccurence(str);
        sc.close();
    }

    public static void letterOccurence(String str)
    {
        HashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        int count=1;
        char[] toChar=str.toCharArray();
        for(int i=0;i<toChar.length;i++)
        {
            if(hashMap.containsKey(toChar[i]))
            {
             hashMap.put(toChar[i],hashMap.get(toChar[i])+1);
            }
            else{
                hashMap.put(toChar[i],count);
            }

        }
        System.out.println(hashMap);
    }
}
