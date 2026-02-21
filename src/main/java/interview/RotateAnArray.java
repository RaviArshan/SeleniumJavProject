package interview;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateAnArray(arr,3);
    }
    static void rotateAnArrayByOne(int[] arr)
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("Array after one rotate "+Arrays.toString(arr));
    }
    static void rotateAnArray(int[] arr, int k)
    {
        for(int i=k;i<arr.length;i++)
        {
            rotateAnArrayByOne(arr);
        }

    }
}
