package interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        System.out.println(duplicateCharacterinString("Code Decode"));
    }
    public static Set<Character> duplicateCharacterinString(String inputString)
    {

     System.out.println("----Input String is --- "+inputString);
     Set<Character> dup=new LinkedHashSet<>();
        HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
        for(int i=0;i<inputString.length();i++)
        {
         if(hashMap.containsKey(inputString.charAt(i)))
         {
          hashMap.put(inputString.charAt(i),hashMap.get(inputString.charAt(i))+1);
         }
         else
         {
             hashMap.put(inputString.charAt(i),1);
         }
        }
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                dup.add(entry.getKey());
            }
        }
        return dup;
    }
}
