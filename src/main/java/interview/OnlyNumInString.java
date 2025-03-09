package interview;

public class OnlyNumInString {
    public static void main(String[] args) {
        String s = "he9llo w2o5r7ld";
        checkNum(s);
    }
    public static void checkNum(String s)
    {
     char[] ch=s.toCharArray();
     for(int i=0;i<ch.length;i++) {
        if(ch[i]>='0'&&ch[i]<='9')  // The condition ch[i] >= '0' && ch[i] <= '9' ensures that the
            // character's ASCII value lies within this range.

         {
         System.out.println(ch[i]+"");
         }
     }
    }
}
