package interview;

public class MethodOverload
{
    public  static void sum(int a)
    {
        System.out.println("MethodOverriding1 sum");
    }

    public void  sum(int a,int b)
    {
        System.out.println("MethodOverriding1 sum");
    }

    public static void main(String[] args) {
        MethodOverload m1=new MethodOverload();
        m1.sum();

    }

    private void sum() {
    }
}
