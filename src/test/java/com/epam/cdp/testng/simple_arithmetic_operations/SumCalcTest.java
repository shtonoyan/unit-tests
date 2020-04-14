package com.epam.cdp.testng.simple_arithmetic_operations;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest {

    @DataProvider(name = "dataForSum")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 0, 0,},
                {1200, 36, 1236},
                {-250, 250, 0},
                {360, -40, 320},
                {-40, -60, -100}
        };
    }

    @Test(dataProvider = "dataForSum", groups = {"simple.operations"})
    public void sumOfTwoNumbers(long firstNumber, long secondNumber, long sum) {
        double actualSum = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(actualSum, sum, "The result is incorrect");
    }
}
