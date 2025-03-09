package interview;

public class Array_1_2_2_6_7_Sum_5 {
    public static void main(String[] args) {
        int arr[]={1,6,7,6,7};
        for(int i=0;i<arr.length-1;i++)
        {
            if(!(arr[i+1]==6 && arr[i+2]==7))
            {
                System.out.println(arr[i]);
            }
        }

    }
}
