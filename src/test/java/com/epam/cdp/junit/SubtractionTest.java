package com.epam.cdp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubtractionTest extends BaseTest {
    public static Object[][] dataForSubtraction() {
        return new Object[][]{
                {0, 0, 0,},
                {12.6, 3.6, 9},
                {-2.5, 2.5, -5},
                {3.60, -4.0, 7.6},
                {-4.6, -6.4, 1.8}
        };
    }

    @ParameterizedTest
    @MethodSource("dataForSubtraction")
    public void sumCalc(double firstNum, double secondNum, double difference){
        Assertions.assertEquals(difference, calculator.sub(firstNum, secondNum), "Wrong result.");
    }
}
