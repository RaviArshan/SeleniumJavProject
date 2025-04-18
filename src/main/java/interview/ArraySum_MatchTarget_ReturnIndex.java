package interview;

import java.util.Arrays;
import java.util.HashMap;

public class ArraySum_MatchTarget_ReturnIndex {

    public static void main(String[] args) {
        int arr[]={2,3,4,9,5};
        int target=13;
        int ans[]=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            int diff=target-arr[i];
            if (hashMap.containsKey(diff))
            {
                ans[0]=i;
                ans[1]=hashMap.get(diff);
                break;
            }
            else{
                hashMap.put(arr[i],i);
            }
        }
        System.out.println("-------"+ans[0]);
        System.out.println("-------"+ans[1]);















    /*    for (int i=0;i<arr.length;i++)
        {
         for(int j=1;i<arr.length;i++)
         {
             if(arr[i]+arr[j]==target)
             {
                 System.out.println(i+" "+j);
             }
         } -- 0(n2) */


    }
}
