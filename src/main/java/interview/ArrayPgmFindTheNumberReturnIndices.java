package interview;

import java.util.Arrays;

public class ArrayPgmFindTheNumberReturnIndices {
    public static void main(String[] args) {
        int[] arr={2,3,-4,-1,6,-9,-2,4};  // 2,-4, 3,-1,6,-9,4,-2
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0 && arr[i+1]<0) {
                temp=arr[i];
                arr[i] =arr[i+1];
                arr[i+1]=temp;
            }
            else if(arr[i+1]>0 && arr[i]<0) {
                temp=arr[i];
                arr[i] =arr[i+1];
                arr[i+1]=temp;
            }

            }
        System.out.println(Arrays.toString(arr));


    }
}
