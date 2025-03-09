package interview;

public class OmitTheFirstCharOfEach_HELLOWORLD_ELLOORLD {
    public static void main(String[] args) {
       String omitString= omitTheFirstCharOfEach_HELLOWORLD_ELLOORLD("Ravi","Shubha");
       System.out.println("----------"+omitString);
    }

    public static String omitTheFirstCharOfEach_HELLOWORLD_ELLOORLD(String str1,String str2)
    {
        String resultStr = "";
        for (int i=1;i<str1.length();i++)
        {
            resultStr+=str1.charAt(i);
        }
        for (int i=1;i<str2.length();i++)
        {
            resultStr+=str2.charAt(i);
        }
        return resultStr;
    }


}
