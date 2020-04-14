package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CosFunctionTest extends BaseTest {

    public static Object[][] cosTestData() {
        return new Object[][]{
                {0, 1},
                {Math.PI, Math.cos(Math.PI)},
                {1 / 2 * Math.PI, Math.cos(1 / 2 * Math.PI)},
                {(1 / 3) * Math.PI, Math.cos((1 / 3) * Math.PI)},
                {(-8 / 3) * Math.PI, Math.cos((-8 / 3) * Math.PI)},
                {(5 / 6) * Math.PI, Math.cos((5 / 6) * Math.PI)},
        };
    }

    @ParameterizedTest
    @MethodSource("cosTestData")
    public void cosFunction(double angle, double cosValue) {
        Assertions.assertEquals(cosValue, calculator.cos(angle));
    }
}
