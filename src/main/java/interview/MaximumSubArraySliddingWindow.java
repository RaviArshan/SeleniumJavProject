package interview;

import java.util.Arrays;

public class MaximumSubArraySliddingWindow {
    public static void main(String args[]) {
        int[] arr = {1, -2, 10, 4, -1, 5, 1, -5, 4};
        int k = 3;
        maxumSubArray(arr,k);
    }

    public static void maxumSubArray(int[] arr,int k) {
        System.out.println(Arrays.toString(arr));
        int slidSum=0,maxSum=-9;
        for(int i=0;i<k;i++)
        {
            slidSum+=arr[i];
        }
        System.out.println(slidSum);
        for(int i=k;i< arr.length-k;i++)
        {
            slidSum=slidSum-arr[i-k]+arr[i];
            maxSum=Math.max(slidSum,maxSum);
        }
        System.out.println(maxSum);

    }
}