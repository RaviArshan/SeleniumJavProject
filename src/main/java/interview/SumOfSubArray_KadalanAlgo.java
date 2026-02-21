package interview;

public class SumOfSubArray_KadalanAlgo {
    public static void main(String[] args) {
        int[] array = {5, 6, -3, 7, -13, 8, -2, 5, -6, 7, -11, 3, 10, -10, -6, -10, 7, 2};
        sumOfSubArray(array);
    }
    public static void sumOfSubArray(int[] arr)
    {
        int sum=arr[0];
        int maxSum=0;
        for(int i=1;i<arr.length;i++)
        {
            if(sum>=0)
            {
                sum+=arr[i];
            }
            else {
                sum=arr[i];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }
        }
        System.out.println(maxSum);



    }
}
