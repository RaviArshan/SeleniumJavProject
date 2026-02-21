package interview;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class String2 {
    public static void main(String[] args)
    {
        String str="aaaa bb c"; //a4b2c1
        String[] strArray=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strArray.length;i++)
        {
            char ch=strArray[i].charAt(0);
            sb.append(ch).append(strArray[i].length());
        }
        System.out.println(sb.toString());
    }

}