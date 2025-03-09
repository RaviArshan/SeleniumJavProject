package interview;

public class EvenSumArray {
    public static void main(String[] args) {
        int arrays[]={2,4,5,6,7,8,2};
        evenSumArray(arrays);
    }
    public static void evenSumArray(int arr[])
    {
        int sumOfEvenArray=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!(arr[i]%2==0))
            {
                sumOfEvenArray+= arr[i];
            }
        }
        System.out.println("Sum of even array "+sumOfEvenArray);

    }
}
