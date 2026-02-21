package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubsetOfNumber {
    public static void main(String[] args) {
        int k=12;
        largestSubSet(k);
    }
    public static void largestSubSet(int k)
    {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=k;i++)
        {
            if(k%i==0)
            {
            l.add(i);
            }
        }
        Iterator iterator= l.iterator();
        int sum=0;
        while (iterator.hasNext()){
            int j= (int) iterator.next();
            sum= sum+j;
        }
        System.out.println(sum);

    }
}
