package interview;

import java.util.HashSet;
import java.util.Iterator;

public class Pracriceinthis {
    public static void main(String[] args) {
       String str="automation";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='o' || ch=='i')
           {
               sb.append(ch);
           }
       }
       String vowelCtring = sb.toString();
        System.out.println(vowelCtring);
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<vowelCtring.length();i++)
        {
            hs.add(vowelCtring.charAt(i));
        }
        System.out.println(hs);
        Iterator itr=hs.iterator();
        StringBuilder sbUniq=new StringBuilder();
        while(itr.hasNext())
        {
            sbUniq.append(itr.next());
        }
        System.out.println(sbUniq.toString());
    }
}
