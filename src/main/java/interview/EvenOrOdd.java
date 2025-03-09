package interview;

public class EvenOrOdd {
    public static void evenOdd(int num)
    {
     if(num<0)
     {
         throw new IllegalArgumentException("Invalid Number");
     }
     else {
         if(num%2==0)
         {
             System.out.println("The number is even");
         }
         else
         {
             System.out.println("The number is odd");

         }
     }
    }
    public static void main(String[] args) {
        evenOdd(-1);
    }
}
