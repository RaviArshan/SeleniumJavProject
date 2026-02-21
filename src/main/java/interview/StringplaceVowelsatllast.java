package interview;// Online Java Compiler
class StringplaceVowelsatlast {
    public static void main(String[] args) {
        String str = "ravi"; //rvai
        method(str);
    }

    public static void method(String str) {
        for (int i = 0; i < str.length(); i++) {
            char  ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int index = str.indexOf(ch);
                System.out.println("index " + index);
                System.out.println("str.substring(0, index) " + str.substring(0, index));
                System.out.println("str.substring(index + 1)  " + str.substring(index + 1));
                 str = str.substring(0, index) + str.substring(index + 1) + ch;
                System.out.println("After moving vowel: " + str);
            }

        }

        System.out.println("Final output: " + str);
    }
}
