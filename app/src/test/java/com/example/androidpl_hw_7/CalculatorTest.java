package com.example.androidpl_hw_7;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("new Calculator()");
        calculator = new Calculator();
    }

    @Test
    public void additionTest() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void additionTestNotEquals() {
        assertNotEquals(2, calculator.add(1, 2));
    }

    @Test
    public void subtractTest() {
        assertEquals(2, calculator.subtract(10,8));
    }

    @Test
    public void subtractTestNotEquals() {
        assertNotEquals(1, calculator.subtract(10,8));
    }

    @Test
    public void multiplyTest() {
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void multiplyTestNotEquals() {
        assertNotEquals(9, calculator.multiply(3,2));
    }

    @Test
    public void divideTest() {
        assertEquals(2, calculator.divide(10,5));
    }

    @Test
    public void divideTestNotEquals() {
        assertNotEquals(1, calculator.divide(10,5));
    }
}
