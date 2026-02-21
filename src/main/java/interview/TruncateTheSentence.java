package interview;

public class TruncateTheSentence {
    public static void main(String[] args) {
        String str="Hello How are you Ravi";
        truncateTheString(str,3);
    }
    public static void truncateTheString(String str,int k)
    {
        String[] strArray=str.split(" ");
        int strLength=strArray.length;
        StringBuilder stringBuilder=new StringBuilder();
     /* sol1   for(int i=0;i<k;i++)
        {
        stringBuilder.append(strArray[i]+" ");
        }
        System.out.println(stringBuilder); */

        //sol2

        int index=0;
        while (k!=0)
        {
            stringBuilder.append(strArray[index]+" ");
            index++;
            k--;
        }
        System.out.println(stringBuilder);
    }
}
