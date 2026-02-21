package testNgTutorials;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersJava implements ITestListener
{
@Override
    public void onTestStart(ITestResult result){
    System.out.println("Test case Name "+result.getTestName());
}

}
