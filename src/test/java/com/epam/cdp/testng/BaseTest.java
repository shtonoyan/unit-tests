package com.epam.cdp.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public abstract class BaseTest {
    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @DataProvider
    public abstract Object[][] dataProvider();
}
