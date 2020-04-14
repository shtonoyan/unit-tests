package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsNegativeTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(longs = {-63, -569, -1, -13})
    public void IsNegativeCalc(long number) {
        Assertions.assertTrue(calculator.isNegative(number));
    }
}
