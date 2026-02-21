package interview;

import java.util.HashMap;

public class babca_b2a2c1 {
    public static void main(String[] args) {
        String str = "babca";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                sb.append(ch);
                sb.append(map.get(ch));
                map.remove(ch);

            }
        }
        System.out.println(sb.toString());
    }
}
