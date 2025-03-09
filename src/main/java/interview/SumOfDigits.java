package interview;

public class SumOfDigits {
    public static void printDigits(int number)
    {
        int sum = 0,digit=0;
        if(number<0)
            System.out.println("Invalid Number");
        else
            while (number>0)
            {
                digit=number % 10;
                sum =sum+digit;
                number=number/10;
            }
        System.out.print(sum);

    }
    public static void main(String[] args) {
        printDigits(559);
    }
}
