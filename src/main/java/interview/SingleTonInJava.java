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

    //A Singleton in Java is a design pattern that ensures a class has only one instance in the entire application and provides
    // a global access point to it.
    // Only one object of the class can be created.
    //
    //Private constructor so no one can create objects directly.
    //
    //Static method to provide the instance.
    //
    //Static field to store the single instance.




    public void getMeessage()
    {
        System.out.println(" Get Message ");
    }
}
