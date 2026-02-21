package interview;

import java.util.Arrays;

public class aPraticeAllPgrmas {
    public static void main(String[] args) {
        int arr[]={1,0,3,2,4,0};
        int n=arr.length;
        int j=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[j--] = arr[i];
            }
        }
        while (j >= 0) {
            arr[j--] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }


    /*


    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 2, 4, 0};

        int n = arr.length;
        int index = 0; // position to place non-zeros

        // Move all non-zeros to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            } 
        }

        // Fill the remaining with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}


     */
}
