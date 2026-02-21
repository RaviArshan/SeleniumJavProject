package interview;

public class CountConsecutiveOne {
    public static void main(String[] args) {
        int arr[]={0,1,81,1,0,1,1,1,8,1,0,0};
        countConsecutiveOne_Optimized(arr);
       // naiveApproach(arr);


    }
    public static void naiveApproach(int[] arr)
    {
        int maxCount=0;
        for (int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]==1)
                {
                    count++;
                }
                else {
                    break;
                }
                maxCount=Math.max(count,maxCount);
            }
        }
        System.out.println(maxCount);


    }



    public static void countConsecutiveOne_Optimized(int[] arr)
    {
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else {
                count=0;
            }
            maxCount=Math.max(count,maxCount);
        }
        System.out.println(maxCount);

    }
}
