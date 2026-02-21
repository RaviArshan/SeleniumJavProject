package interview;

import java.util.Arrays;

public class MoveZeroToRight_LeetCode {
    public static void main(String[] args) {
        int[] arr={2,0,9,1,2,0,6};
        moveZeroToRight(arr);
    }
    public static void moveZeroToRight(int[] arr)
    {
       int l=0;int r=arr.length-1;
       while(l<r)
       {
           if(arr[l]==0)
           {
               int temp = arr[l];
               arr[l] = arr[r];
               arr[r] = temp;
               l++;
               r--;
           }
           else {
               l++;
           }
       }
        System.out.println(Arrays.toString(arr));


    }
}
