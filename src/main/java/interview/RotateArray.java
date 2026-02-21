package interview;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5}; //5,4,3,2,1
        int k=3;
       // rotateArray_byOneElemen(arr);
        rotateArray(arr,k);
    }

    static void rotateArray_byOneElemen(int[] arr)
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
    static void rotateArray(int[] arr,int k)
    {
        for(int i=1;i<=k;i++)
        {
            rotateArray_byOneElemen(arr);
        }
    }
}
