package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public abstract class BaseTest {
    protected static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterAll
    public static void tearDown() {
        calculator = null;
    }
}
