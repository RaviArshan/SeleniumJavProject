package interview;

public class MethodOverriding2 extends MethodOverriding1{
    public   void  sum()
    {
        System.out.println("MethodOverriding2 sum");
    }
    public void  sub()
    {
        System.out.println("MethodOverriding2 sub");
    }


    public static void main(String[] args) {
        MethodOverriding1 methodOverriding1= new MethodOverriding1();
        methodOverriding1.sub();
        methodOverriding1.sum();
    }
    // cannot override static,final methods
    // we can reference variable of parent class but we cant keep the refernce of sub class

}
