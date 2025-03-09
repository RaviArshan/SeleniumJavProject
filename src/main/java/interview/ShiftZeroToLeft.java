package interview;

public class ShiftZeroToLeft {
    public static void main(String[] args) {
        int arr[]={0,0,3,4,5,6,0};
        shiftZeroToLeft(arr);
    }
    public static void shiftZeroToLeft(int arr[])
    {
        int shiftZero[]=new int[arr.length];
        int count=arr.length-1;
        System.out.println(shiftZero.length);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                shiftZero[count]=arr[i];
                count--;
            }

        }
        for (int i = 0; i < shiftZero.length; i++) {
            System.out.print(shiftZero[i] + " ");
        }    }
}



/*
package interview;

public class ShiftZeroToLeft {
    public static void main(String[] args) {
        int arr[]={0,0,3,4,5,6,0};
        shiftZeroToLeft(arr);
    }
    public static void shiftZeroToLeft(int arr[])
    {
        int shiftZero[]=new int[arr.length];
        int count=0;
        System.out.println(shiftZero.length);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                shiftZero[count]=arr[i];
                count++;
            }

        }
        for (int i = 0; i < shiftZero.length; i++) {
            System.out.print(shiftZero[i] + " ");
        }    }
}




 */
