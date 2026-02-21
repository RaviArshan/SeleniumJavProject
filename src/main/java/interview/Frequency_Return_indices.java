package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frequency_Return_indices {
    public static void main(String[] args) {



        // brute force

        /*
         public static void main(String[] args)
    {
        int[] arr={1,2,10,10,4,5,6,6};
        int[] freq=frequency(arr);
        System.out.println(Arrays.toString(freq));

    }
    public static int[] frequency(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                 return new int[]{arr[i], j};
                }   2q3 `h
            }

        }
        return null;
    }
                */
        int arr[]={1, 2, 2, 3, 4, 4, 4,8,9,9};
        HashMap<Integer,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if (hashMap.containsKey(arr[i]))
            {
                if (hashMap.get(arr[i])>=0) {
                    System.out.println("Repeating ele " + arr[i] + " First indices " + hashMap.get(arr[i]));
                    hashMap.put(arr[i],-1);
                }

            }
            else {
                hashMap.put(arr[i],i); // 1, 0   2,1
            }
        }




    }
}
