package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SumOfArrayUniueElements {
    public static void main(String[] args) {
        int array[]={1,1,5,8,5,3};
        sumOfUniqueArray(array);
    }
    public static void sumOfUniqueArray(int[] array)
    {
        int sum=0;
        HashMap<Integer,Integer> hashMap=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(hashMap.containsKey(array[i])) {
              hashMap.put(array[i],hashMap.get(array[i])+1);
            }
            else {
            hashMap.put(array[i],1);
            }
        }

        for(HashMap.Entry<Integer,Integer>  unique: hashMap.entrySet())
            {
           if(unique.getValue()==1)
           {
            sum+=unique.getKey();
           }
            }
        System.out.println(sum);

    }
}
