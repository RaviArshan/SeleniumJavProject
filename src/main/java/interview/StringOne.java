package interview;// Online Java Compiler
class StringOne {
    public static void main(String[] args) {
        String str="my india";  //my ndiai
        String[] strArray=str.split(" ");
        strMethod(strArray);
    }
    public static void strMethod(String s[])
    {
        for(int i=0;i<s.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            char ch=s[i].charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            {
                String remFirstCh=s[i].substring(1);
                sb.append(remFirstCh).append(ch);
            }
            else
            {
                sb.append(s[i]);
            }
            System.out.println(sb.toString());
        }
    }
}