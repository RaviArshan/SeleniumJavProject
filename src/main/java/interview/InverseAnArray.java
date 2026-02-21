package interview;

import java.util.Arrays;

public class InverseAnArray {
    public static void main(String[] args) {
        int[] arr={2,3,1,0,4};
        int[] inverse=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
          /*  int v=arr[i];
            inverse[v]=i; */
            //in a single line
            inverse[arr[i]]=i;
        }
        System.out.println(Arrays.toString(inverse));
    }
}
