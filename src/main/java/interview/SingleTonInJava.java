package interview;

public class SingleTonInJava {

    private static SingleTonInJava singleTonInJava;

    SingleTonInJava() {};

    public static SingleTonInJava getInstance(){
        if(singleTonInJava==null)
        {
            singleTonInJava=new SingleTonInJava();
        }
        return singleTonInJava;
    }

    public void getMeessage()
    {
        System.out.println(" Get Message ");
    }
}
