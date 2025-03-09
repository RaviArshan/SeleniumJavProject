package testNgTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestCase {


    //https://www.youtube.com/watch?v=7TDfYcUzv6o&list=PLLS0D9-W-1dkMzXYlJT1IwRqV2Y4hG1Ix&index=17

    /*
    During the test execution, the test cases may fail and that is inevitable. We have to rerun the failed test cases to verify whether its a temporary failure or not. There are three ways we can rerun the failed test cases.
1. We can run testng-failed.xml manually.
2. Using IRetryAnalyzer Interface we can rerun the failed test cases automatically.
3. Using IAnnotationTransformer also we can rerun the failed test cases automatically.
    */

    //1)First By re-running the failed Test testng-failed.xml file in the test-output, This will run only the failed test
     //2)IRetryAnalyzer  - by implementing the IRetryAnalyzer iterface
    //3)IAnnotationTransfer(i) and IRetryAnalyzer. (Both to be used together)
   // @Test(retryAnalyzer=IRetryAnalyzerClass.class)  - if you are using IAnnotationTransfer we can skip this.
    @Test
    public void test1()
    {
        System.out.println("My Test 1");
       //Assert.fail();
    }

    @Test(retryAnalyzer=IRetryAnalyzerClass.class)
    public void test2()
    {
        System.out.println("My Test 2");
        Assert.fail();
    }
}
