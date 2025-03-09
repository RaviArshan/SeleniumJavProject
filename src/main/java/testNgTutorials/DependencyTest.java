package testNgTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test(priority = 1)
    public void testOne()
    {
        System.out.println("Test 1");
        Assert.fail();
    }

    @Test(priority = 3,dependsOnMethods = {"testOne"})  //{"testOne"} should pass then only testTwo method
    // will be executed and tests will be ignored
    public void testTwo()
    {
        System.out.println("Test 2");
    }

    @Test(priority = 2,dependsOnMethods = {"testOne","testTwo"}, alwaysRun = true)
    //alwaysRun = true  -  even the depends method fails, this will be executed.
    public void testFour()
    {
        System.out.println("Test 3");
    }
}
