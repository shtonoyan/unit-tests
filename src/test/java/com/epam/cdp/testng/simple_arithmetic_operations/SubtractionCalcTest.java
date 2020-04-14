package com.epam.cdp.testng.simple_arithmetic_operations;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionCalcTest extends BaseTest {
    @DataProvider(name = "dataProviderForSubtractionTest")
    public Object[][] dataProvider() {
        return new Object[][]{
                {1500, 200, 1300},
                {-200, -100, -100},
                {-250, 150, -400},
                {0, 0, 0},
                {0, -40, 40},
                {100, 800, -700}
        };
    }

    @Test(dataProvider = "dataProviderForSubtractionTest", groups = {"simple.operations"})
    public void subtractionOfNumbers(long firstNumber, long secondNumber, long difference) {
        Assert.assertEquals(calculator.sub(firstNumber, secondNumber), difference, "Wrong result");
    }
}

