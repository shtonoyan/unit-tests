package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class SinFunctionTest extends BaseTest {

    public static Object[][] sinTestData() {
        return new Object[][]{
                {0, 0},
                {Math.PI, Math.sin(Math.PI)},
                {1 / 2 * Math.PI, Math.sin(1 / 2 * Math.PI)},
                {(1 / 3) * Math.PI, Math.sin((1 / 3) * Math.PI)},
                {(-8 / 3) * Math.PI, Math.sin((-8 / 3) * Math.PI)},
                {(5 / 6) * Math.PI, Math.sin((5 / 6) * Math.PI)},
        };
    }

    @ParameterizedTest
    @MethodSource("sinTestData")
    public void sinFunction(double angle, double sinValue) {
        Assertions.assertEquals(sinValue, calculator.sin(angle));
    }
}
