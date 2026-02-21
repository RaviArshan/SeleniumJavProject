package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraySum_MatchTarget_ReturnIndex {

    public static void main(String[] args) {
        int arr[]={2,3,4,9,5};
        int target=13;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            int diff=target-arr[i];
            if (hashMap.containsKey(diff))
            {
                list.add(i);
                list.add(hashMap.get(diff));
                break;
            }
            else{
                hashMap.put(arr[i],i);
            }
        }
        System.out.println("-------"+list);















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
