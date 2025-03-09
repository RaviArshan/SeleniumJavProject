package testNgTutorials;

import org.testng.annotations.*;

public class TestngAnnotations1 {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTes()
    {
        System.out.println("afterTes");
    }

    @BeforeMethod//It Will be executed before each Test Method
    public void beforeMethod()
    {
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod");
    }
    @Test
    public void test1()
    {
        System.out.println("Test1");
    }
    @Test
    public void test2()
    {
        System.out.println("Test2");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass");
    }
  
}
