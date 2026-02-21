package interview;


class String_apple_2_bpplf {
    public static void main(String[] args) {
        String str="apple";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i')
            {

                // char c=ch+1;
                sb.append((char)(ch+1));
            }
            else
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}












