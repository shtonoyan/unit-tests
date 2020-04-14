package com.epam.cdp.testng.exponential_functions;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class squareRootCalcTest extends BaseTest {

    @DataProvider(name = "dataForSqrt")
    @Override
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {6, Math.sqrt(6)},
                {658, Math.sqrt(658)},
                {-9, Math.sqrt(-9)}
        };
    }

    @Test(dataProvider = "dataForSqrt")
    public void sqrtCalc(double number, double sqrtValue) {
        Assert.assertEquals(calculator.sqrt(number), sqrtValue, "Wrong result");
    }
}
