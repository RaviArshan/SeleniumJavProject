package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SumArrayPblm {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        System.out.println(twoSum(arr,target));
    }

    public static int[]  twoSum(int[] arr,int target)
    {
        LinkedHashMap hashMap=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=target-arr[i];
            if(hashMap.containsKey(num))
            {
                int arr1[]={(int) hashMap.get(num),i};
                return arr1;
            }
            hashMap.put(arr[i],i);
        }

    return null;
    }
}
