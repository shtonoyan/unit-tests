package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(longs = {0, 569, 1, -13})

    public void IsPositiveCalc(long number) {
        Assertions.assertTrue(calculator.isPositive(number));
    }

}
