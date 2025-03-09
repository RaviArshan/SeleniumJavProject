package testNgTutorials;

import org.testng.annotations.Test;

public class PrioityTest {

    //If no prioirty is given order is based on the alphabetical order
    @Test(priority = 1)
    public void testOne()
    {
        System.out.println("Test 1");
    }

    @Test(priority = 3,enabled = false)  // enabled = false we can skip
    public void testTwo()
    {
        System.out.println("Test 2");
    }

    @Test(priority = 2)
    public void testFour()
    {
        System.out.println("Test 3");
    }
}
