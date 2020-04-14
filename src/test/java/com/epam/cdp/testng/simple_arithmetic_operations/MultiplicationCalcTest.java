package com.epam.cdp.testng.simple_arithmetic_operations;

import com.epam.cdp.testng.BaseTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationCalcTest extends BaseTest {

    @DataProvider(name = "dataProviderForMultiplication")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 5.3, 0},
                {-2.15, -4, 8.6},
                {-5.9, 6.2, -36.58},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "dataProviderForMultiplication")
    public void multiplicationOfNumbers(double firsNumber, double secondNumber, double expectedProduct) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.mult(firsNumber, secondNumber), expectedProduct, "Wrong result");
    }
}
