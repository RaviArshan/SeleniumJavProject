package testNgTutorials;

import org.testng.annotations.Test;

public class TestMultipleTimes {

    @Test(invocationCount = 4)
    public void testMethod()
    {
        System.out.println("------Test---------");
    }
}
