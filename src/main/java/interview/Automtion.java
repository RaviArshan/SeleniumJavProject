package interview;

import java.util.HashMap;

public class Automtion {
    public static void main(String args[]) {
        String str = "automation";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hash.containsKey(str.charAt(i))) {
                hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);
            } else {
                hash.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = hash.get(ch);

            if (count > 1) {
                sb.append(count);
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
    }
