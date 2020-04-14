package com.epam.cdp.testng.exponential_functions;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerCalcTest extends BaseTest {

    @DataProvider(name = "dataForPow")
    @Override
    public Object[][] dataProvider() {
        return new Object[][]{
                {-2, 4, Math.pow(-2, 4)},
                {9, -2, Math.pow(9, -2)},
                {0, 65, 0},
                {956, 0, 1}
        };
    }

    @Test(dataProvider = "dataForPow")
    public void powCal(double number, double power, double powerValue) {
        Assert.assertEquals(calculator.pow(number, power), powerValue, "Wrong result.");
    }
}