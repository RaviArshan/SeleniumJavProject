package interview;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        String str="Ravi";
        reverSeVowels(str);
    }
    public static void reverSeVowels(String str)
    {
      char ch[]=str.toCharArray();
      int end=str.length()-1;
      for(int i=0;i<ch.length;i++)  //i=1
      {
          if (isVowels(ch[i]))
          {
              char temp=ch[i];  //temp=a and ch[i]=a
              ch[i]=ch[end];  //ch[end]=i ch[1]=i
              ch[end]=temp; //
          }
      }
        System.out.println(ch);


    }
    public static boolean isVowels(char ch)
    {
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
          return  true;
        }
        return  false;
    }
}
