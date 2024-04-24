package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseSuite {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite has started");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite has started");
    }

}
