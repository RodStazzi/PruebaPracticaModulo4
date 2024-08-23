package com.ejemplo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(2, Calculator.factorial(2));
        assertEquals(6, Calculator.factorial(3));
        assertEquals(24, Calculator.factorial(4));
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testIsPrime() {
        assertFalse(Calculator.isPrime(0));
        assertFalse(Calculator.isPrime(1));
        assertTrue(Calculator.isPrime(2));
        assertTrue(Calculator.isPrime(3));
        assertFalse(Calculator.isPrime(4));
        assertTrue(Calculator.isPrime(5));
        assertFalse(Calculator.isPrime(9));
        assertTrue(Calculator.isPrime(13));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(0, Calculator.sumOfDigits(0));
        assertEquals(1, Calculator.sumOfDigits(1));
        assertEquals(3, Calculator.sumOfDigits(12));
        assertEquals(6, Calculator.sumOfDigits(123));
        assertEquals(21, Calculator.sumOfDigits(123456));
    }

    @Test
    public void testIsPerfect() {
        assertFalse(Calculator.isPerfect(0));
        assertFalse(Calculator.isPerfect(1));
        assertTrue(Calculator.isPerfect(6));
        assertTrue(Calculator.isPerfect(28));
        assertFalse(Calculator.isPerfect(12));
    }

    @Test
    public void testToBase64() {
        assertEquals("MA==", Calculator.toBase64(0));
        assertEquals("MQ==", Calculator.toBase64(1));
        assertEquals("MjA=", Calculator.toBase64(20));
        assertEquals("MTAw", Calculator.toBase64(100));
    }
}
