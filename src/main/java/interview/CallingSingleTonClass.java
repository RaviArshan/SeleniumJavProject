package interview;

public class CallingSingleTonClass {
    public static void main(String[] args) {
        SingleTonInJava.getInstance().getMeessage();

        SingleTonInJava singleTonInJava=new SingleTonInJava();
    }
}
