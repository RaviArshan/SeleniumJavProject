package interview;

import java.util.HashMap;

public class CountNumberOfCharacterAABBCCDDA2B2C2D2 {
    public static void main(String[] args) {
    countNumberCharacter("aabbccd");
    }
    public static void countNumberCharacter(String str)
    {
        int len=str.length();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(hashMap.containsKey(ch))
            {
                hashMap.put(ch,hashMap.get(str.charAt(i))+1);
            }
            else
            {
                hashMap.put(ch,1);
            }
        }

    }

}
