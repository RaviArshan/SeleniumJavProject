package interview;

import java.util.Arrays;

public class FindTheElementInTheArrayAndReturnTheIndex {
    public static void main(String[] args) {
        int[] arr={13,4,5,2,10,7};
        int key=2;
       int value= method(arr,key);
       System.out.println(value);
    }
    public static int method(int arr[],int key)
    {
       //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       System.out.println("---------Sorted Array---------------"+Arrays.toString(arr));
        int low=0;
        int high= arr.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else {
                if(key<arr[mid])
                {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }

            }
        }
return  -1;
    }
}
