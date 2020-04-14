package com.epam.cdp.testng.trigonometric_functions;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalcTest extends BaseTest {
    @DataProvider(name = "dataForCos")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 1},
                {Math.PI, Math.cos(Math.PI)},
                {1 / 2 * Math.PI, Math.cos(1 / 2 * Math.PI)},
                {(1 / 3) * Math.PI, Math.cos((1 / 3) * Math.PI)},
                {(-8 / 3) * Math.PI, Math.cos((-8 / 3) * Math.PI)},
                {(5 / 6) * Math.PI, Math.cos((5 / 6) * Math.PI)},
        };
    }

    @Test(dataProvider = "dataForCos")
    public void cosFunction(double angle, double cosValue) {
        System.out.println(calculator.isNegative(-5));
        Assert.assertEquals(calculator.cos(angle), cosValue, "Incorrect result.");
    }
}
