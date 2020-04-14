package com.epam.cdp.testng.trigonometric_functions;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseTest {

    @DataProvider(name = "dataForSin")
    @Override
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 0},
                {2 * Math.PI, Math.sin(2 * Math.PI)},
                {1 / 2 * Math.PI, Math.sin(1 / 2 * Math.PI)},
                {-(1 / 2) * Math.PI, Math.sin(-(1 / 2) * Math.PI)},
                {3 / 2 * Math.PI, Math.sin(3 / 2 * Math.PI)},
                {5 / 6 * Math.PI, Math.sin(5 / 6 * Math.PI)},
                {6 / 5 * Math.PI, Math.sin(6 / 5 * Math.PI)}
        };
    }

    @Test(dataProvider = "dataForSin")
    public void sinFunction(double angle, double sinValue) {
        Assert.assertEquals(calculator.sin(angle), sinValue, "IncorrectValue");
    }
}
