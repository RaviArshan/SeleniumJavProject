package interview;

public class SeperatesNumbersAndLetters {
    public static void main(String[] args) {
        String string="ravi123shuha";
        StringBuilder charBuilder=new StringBuilder();
        StringBuilder numberBuilder=new StringBuilder();
        String str = null,num = null;
        for (int i=0;i<string.length();i++)
        {
            char charFromString=string.charAt(i);
            int ascii=(int) charFromString;  // to convert to ascii
            if(ascii>=97 && ascii<=122)
            {
                str= String.valueOf(charBuilder.append(charFromString));
            }
            else {
                num= String.valueOf(numberBuilder.append(charFromString));
            }
        }
        System.out.println(str);
        System.out.println(num);


    }
}
