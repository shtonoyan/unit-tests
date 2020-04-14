package com.epam.cdp.testng.trigonometric_functions;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalcTest extends BaseTest {
    @DataProvider(name = "dataForTan")
    @Override
    public Object[][] dataProvider() {
        return new Object[][]{
                {2 / 3 * Math.PI, Math.tan(2 / 3 * Math.PI)},
                {2 * Math.PI, Math.tan(2 * Math.PI)},
                {0, 1},
                {-2 * Math.PI, Math.tan(-2 * Math.PI)},
                {1 / 6 * Math.PI, Math.tan(1 / 6 * Math.PI)},
                {-1 / 6 * Math.PI, Math.tan(-1 / 6 * Math.PI)}
        };
    }

    @Test(dataProvider = "dataForTan")
    public void tgFunction(double angle, double tanValue) {
        Assert.assertEquals(calculator.tg(angle), tanValue, "Incorrect value.");
    }
}
