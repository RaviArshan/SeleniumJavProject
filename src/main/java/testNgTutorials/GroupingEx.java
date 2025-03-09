package testNgTutorials;

import org.testng.annotations.Test;

public class GroupingEx {

    @Test(groups = {"sanity"})
    public void  test1()
    {
        System.out.println("Test1");
    }
    @Test(groups = {"regression"})
    public void  test2()
    {
        System.out.println("Test2");
    }
    @Test(groups = {"sanity"})
    public void  test3()
    {
        System.out.println("Test3");
    }
    @Test(groups = {"sanity","regression"})
    public void  test4()
    {
        System.out.println("Test4");
    }

}
