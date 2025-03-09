package interview;

public class ReveseAnArray {
    public static void main(String[] args) {
        reverseArray();
    }
    public static void reverseArray()
    {
      int arr[]={2,3,4,5,6};
      int n=0;
      for (int i:arr)
      {
          System.out.println("Original Array "+i);
      }
      int revArray[]=new int[arr.length]; // Store the original array size
      System.out.println("Length of the revArray "+revArray.length);
      for(int i=arr.length-1;i>=0;i--)
      {
          revArray[n]=arr[i];
          n++;

      }

        for (int i:revArray)
        {
            System.out.println("Original Array "+i);
        }
    }
}
