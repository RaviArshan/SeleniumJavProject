package interview;

public class RemoveSpaceInTheString {
    public static void removeSpaceFromString(String str)
    {
        System.out.println("Original String is::"+str);
        char[] strArray= str.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println("---------"+strArray.length);
        for(int i=0;i<strArray.length;i++)
        {
          if(strArray[i] != ' ')
          {
              stringBuffer.append(strArray[i]);
          }
          String withOutSpace=stringBuffer.toString();
          System.out.println(withOutSpace);

        }
    }

    public static void main(String[] args) {
        String str="I Love My India";
        removeSpaceFromString(str);
    }
}
