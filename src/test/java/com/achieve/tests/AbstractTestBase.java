package com.achieve.tests;

import com.achieve.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTestBase {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
