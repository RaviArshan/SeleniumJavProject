package interview;

public class LargestSubstringPresentInS1andShouldPresentinS2 {
    public static void main(String[] args) {
        String str1 = "welcomeindia";
        String str2 = "cgomeinf";
        largestSubstring(str1, str2);
    }

    public static void largestSubstring(String str1, String str2) {
        String largest = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {  // j <= str1.length()
                String sd = str1.substring(i, j);
                if (str2.contains(sd) && sd.length() > largest.length()) {
                    largest = sd;
                }
            }
        }
        System.out.println("Largest substring: " + largest);
    }
}