package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="aabsdnsb";
        firstNonRepeatingCharacter(str);
    }
    public static void firstNonRepeatingCharacter(String str)
    {
        HashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=1;
            if(hashMap.containsKey(ch))
            {
             hashMap.put(ch,hashMap.get(ch)+1);
            }
            else {
                hashMap.put(ch,count);
            }
        }
        for(Map.Entry<Character,Integer> map:hashMap.entrySet())
        {
            if(map.getValue()==1)
            {
                System.out.println("first non repeatin character "+map.getKey());
                break;
            }
        }
    }
}
