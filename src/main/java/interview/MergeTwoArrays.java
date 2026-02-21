package interview;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[]={10,2,3};
        int arr2[]={6,7};
        mergeTwoArrays(arr1,arr2);
    }
    public static void mergeTwoArrays(int[] arr1,int[] arr2)
    {
        int mergeArrays[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            mergeArrays[i]=arr1[i];  // arr -  merge - 2
        }

        for(int i=0;i<arr2.length;i++)
        {
            mergeArrays[arr1.length+i]=arr2[i];
        }
        //sort the merged array
        int[] mergeArray=new int[arr1.length+arr2.length];
        for(int i=0;i<mergeArray.length-1;i++)
        {
            for(int j=0;j<mergeArray.length-1;j++)
            {
                if(mergeArray[j]>mergeArray[j+1])
                {
                    int temp=mergeArray[j];
                    mergeArray[j]=mergeArray[j+1];
                    mergeArray[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(mergeArrays));


    }
}
