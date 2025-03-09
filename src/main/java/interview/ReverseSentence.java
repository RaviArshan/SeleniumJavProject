package interview;

public class ReverseSentence {

  /*  public static String reverseSentence(String str) {
        String[] words=str.split(" ");
        StringBuilder revb = new StringBuilder("");
        for(int j = words.length - 1; j >= 0 ; j--)
        {
            revb.append(words[j]);
            revb.append(" ");
        }
        return revb.toString();
    }*/
















    public static void main(String[] args) {

       System.out.println( reverseSentence("I love my India"));

    }


    public static String  reverseSentence(String str)
    {
    StringBuffer sb=new StringBuffer();
    String[] splitBySpace=str.split(" ");
  for(int i=splitBySpace.length-1;i>=0;i--)
  {
 sb.append(splitBySpace[i]);
 sb.append(" ");
  }
        return sb.toString();

    }

}