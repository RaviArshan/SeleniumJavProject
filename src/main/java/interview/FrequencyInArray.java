package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyInArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4, 4, 4};
        HashMap<Integer,Integer>  hashMap=new LinkedHashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if (hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);

            }
            else {
                hashMap.put(arr[i],count);
            }
        }
        System.out.println(hashMap);


    }
}
