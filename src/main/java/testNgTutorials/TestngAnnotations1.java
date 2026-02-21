package testNgTutorials;
import org.testng.annotations.*;
public class TestngAnnotations1 {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite");
    }


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



    //beforeSuite
    //beforeTest
    //beforeClass
    //beforeMethod
    //Test1
    //afterMethod
    //beforeMethod
    //Test2
    //afterMethod
    //afterClass
    //afterTes
    //afterSuite


    //@BeforeSuite – Runs once before any tests in the entire suite (usually used to set up database connections, global config).
    //
    //@BeforeTest – Runs before all test methods in a <test> tag in the testng.xml file.
    //
    //@BeforeClass – Runs once before any test method in this specific Java class.
    //
    //@BeforeMethod – Runs before each test method.
    //(If you had multiple @Test methods, this would run before each of them.)
    //
    //@Test – The actual test method (Test2).
    //
    //@AfterMethod – Runs after each test method (cleanup tasks).
    //
    //@AfterClass – Runs once after all test methods in the class have run.
    //
    //@AfterTest – Runs after all tests in the <test> tag.
    //
    //@AfterSuite – Runs once after all tests in the suite have finished.

}
