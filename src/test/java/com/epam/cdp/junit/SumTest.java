package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SumTest extends BaseTest {
    public static Object[][] dataForSum() {
        return new Object[][]{
                {0, 0, 0,},
                {12.6, 3.6, 16.2},
                {-2.5, 2.5, 0},
                {3.60, -4.0, 0.4},
                {-4.6, -6.4, -11}
        };
    }

    @ParameterizedTest
    @MethodSource("dataForSum")
    public void sumCalc(double firstNum, double secondNum, double sum){
        Assertions.assertEquals(sum, calculator.sum(firstNum, secondNum), "Wrong result.");
    }
}
