package interview;

public class CountVowels {
    public static void main(String[] args) {
        vowelsCount("Ravi Shubha Janu");
    }

    public static void vowelsCount(String str) {
        int vowelCount = 0;
        char[] chArray = str.toCharArray();
        StringBuffer sbr = new StringBuffer();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == 'a' || chArray[i] == 'e' || chArray[i] == 'i' || chArray[i] == 'o'
                    || chArray[i] == 'u') {
                vowelCount++;
                sbr.append(chArray[i]);


            }
            System.out.println("Counts of the vowel: " + vowelCount);
            String vowels = sbr.toString();
            System.out.println("Vowels in the String: " + vowels);


        }
    }
}