package interview;

import java.util.*;

public class LargestElementDoesNotHavwDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 17, 3, 8, 8};  // [2,7,8] = 8
        method(arr);
    }
    public static void method(int arr[])
    {
        HashMap<Integer,Integer> hashMap= new LinkedHashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map:hashMap.entrySet())
        {
            if(map.getValue()==1)
            {
                list.add(map.getKey());
            }
        }
        Integer[] arrl = list.toArray(new Integer[0]);
        int largest=arrl[0];
        for(int i=0;i<list.size();i++)
        {
            if(arrl[i]>largest)
            {
                largest=arrl[i];
            }
        }
        System.out.println(largest);
    }
}
