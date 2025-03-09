package testNgTutorials;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerClass implements IRetryAnalyzer {

    int failedTestCount=0;
    int retryCount=5;
    @Override
    public boolean retry(ITestResult iTestResult) { // This method will always return the false

        if(retryCount>failedTestCount)
        {
            failedTestCount++;
            System.out.println("failedTestCount"+failedTestCount);
            System.out.println("methodName"+iTestResult.getMethod().getMethodName());
            return true;
        }
        return false;
    }
}
