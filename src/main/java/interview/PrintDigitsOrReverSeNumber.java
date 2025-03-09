package interview;

public class PrintDigitsOrReverSeNumber {
    public static void printDigits(int number)
    {
        int digit=0;
        if(number<0)
            System.out.println("Invalid Number");
        else
            while (number>0)
            {
                digit=number % 10;
                System.out.print(digit);
                number=number/10;


            }
    }
    public static void main(String[] args) {
        printDigits(7654560);
    }
}
