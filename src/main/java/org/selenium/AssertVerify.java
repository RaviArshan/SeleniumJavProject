package org.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

    //.get() -  It will not maintain the history and it waits until the all the ele in dom loaded.
    //.navigate().to - It maintains the history and contains .forwrd(), back(), refresh and
    // also if the elements partials loaded in the DOM it moves to perform next

 //   @Test
    public void assertMethod()
    {
        System.out.println("Before Assertion");
        Assert.fail(); // Once the assert is failed the next statement will not be executed
        System.out.println("After Assertion");
    }

    @Test    //verify means soft assert
    public void verifyMethod()  // soft assert -- interm called as verify
    {
        SoftAssert soft=new SoftAssert();
        System.out.println("Before Assertion");
        soft.fail(); // Once the assert is failed the next statement will  be executed
        System.out.println("After Assertion");
    }
}
