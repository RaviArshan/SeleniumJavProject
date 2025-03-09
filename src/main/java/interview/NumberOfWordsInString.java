package interview;

public class NumberOfWordsInString {
    public static void stringCount(String str)
    {
        String[] strArray=str.split(" ");
        System.out.println("String count "+strArray.length);
    }

    public static void numberSpace(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
            {
               count++;
            }
        }
        System.out.println("space counnt"+count);
    }
    public static void main(String[] args) {
        String str="I love my india";
        stringCount(str);
        numberSpace(str);

    }
}
