package interview;

public class Java12612_6 {
    public static void main(String[] args) {
        int[] arr={1,1,8,9,4,1,3,2,9};
        boolean t=function(arr);
        System.out.println(t);
    }
    public static boolean function(int[] arr)
    {
        int sum=0;
        int leftSum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            sum=sum-arr[i];

            if (sum == leftSum) {
                System.out.println(arr[i]);
                return true;
            } else {
            leftSum=leftSum+arr[i];

            }
        }

        return false;

    }
}
