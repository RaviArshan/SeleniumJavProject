package interview;

public class Trueifthearraycontainsthreeincreasing {
    public static void main(String[] args) {
        int givenArray[] = {2,0,4,5,6,7};
        threeIncreasingMethod(givenArray);
    }
    public static void threeIncreasingMethod(int[] arr)
    {
        int length=arr.length;
        boolean flag=false;
        System.out.println("Length of the array "+length);
        if(arr.length<=2)
        {
            System.out.println("Length of the array showed be >3");
        }
        else {
            for(int i=1;i<length-1;i++)
            {
                if(arr[i]-arr[i-1]==1 && arr[i+1]-arr[i]==1)
                {
                    flag=true;
                }
            }
            System.out.println(flag);
        }

    }
}
