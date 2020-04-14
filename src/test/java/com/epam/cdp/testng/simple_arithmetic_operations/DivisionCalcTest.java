package com.epam.cdp.testng.simple_arithmetic_operations;

import com.epam.cdp.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionCalcTest extends BaseTest {

    @DataProvider(name = "dataForDivision")
    @Override
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 150, 0},
                {180, 60, 3},
                {-800, 10, -80},
                {630, -7, -90},
                {-270, -30, 9}
        };
    }

    @Test(dataProvider = "dataForDivision")
    public void divisionOfTwoNumbers(long firstNumber, long secondNumber, long expectedRatio) throws ArithmeticException {
        Assert.assertTrue(calculator.div(firstNumber, secondNumber) == expectedRatio, "Wrong result");
    }
}
