package interview;

import java.io.CharArrayReader;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "progprpamming";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                Character c = ch;
                System.out.println(c);
                break;
            } else {
                set.add(ch);
            }
        }
    }
}
