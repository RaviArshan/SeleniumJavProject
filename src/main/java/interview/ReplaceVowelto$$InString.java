package interview;

public class ReplaceVowelto$$InString {
    public static void replaceTo$(String str)
    {
        String sh="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='u' || str.charAt(i)=='e')
            {
                sh= str.replaceAll(String.valueOf(str.charAt(i)),"\\$");
            }
            System.out.print(sh.charAt(i));
        }
    }

    public static void main(String[] args) {
        replaceTo$("uu Te se");
    }
}
