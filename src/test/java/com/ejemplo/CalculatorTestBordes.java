package com.ejemplo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTestBordes {

    @Test
    public void testFactorialZero() {
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Calculator.factorial(1));
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(3628800, Calculator.factorial(10));
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(2432902008176640000L, Calculator.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        Calculator.factorial(-1);
    }

    @Test
    public void testIsPrimeEdgeCases() {
        // Casos de borde para números primos
        assertFalse(Calculator.isPrime(-1)); // Número negativo
        assertFalse(Calculator.isPrime(0));  // Cero
        assertFalse(Calculator.isPrime(1));  // Uno
        assertTrue(Calculator.isPrime(2));   // Primer número primo
        assertTrue(Calculator.isPrime(2147483647)); // Mayor número primo en el rango de int
    }

    @Test
    public void testSumOfDigitsEdgeCases() {
        // Casos de borde para suma de dígitos
        assertEquals(0, Calculator.sumOfDigits(0)); // Suma de dígitos de 0
        assertEquals(1, Calculator.sumOfDigits(1)); // Suma de dígitos de 1
        assertEquals(45, Calculator.sumOfDigits(123456789)); // Suma de dígitos de un número grande
    }

    @Test
    public void testIsPerfectEdgeCases() {
        // Casos de borde para números perfectos
        assertFalse(Calculator.isPerfect(-6)); // Número negativo
        assertFalse(Calculator.isPerfect(0));  // Cero
        assertFalse(Calculator.isPerfect(1));  // Uno
        assertTrue(Calculator.isPerfect(6));   // Primer número perfecto
        assertTrue(Calculator.isPerfect(8128)); // Número perfecto grande
    }

    @Test
    public void testToBase64EdgeCases() {
        // Casos de borde para Base64
        assertEquals("MA==", Calculator.toBase64(0)); // Base64 de 0
        assertEquals("LTI=", Calculator.toBase64(-2)); // Base64 de un número negativo
        assertEquals("MjE0NzQ4MzY0Nw==", Calculator.toBase64(2147483647)); // Base64 del mayor número int
    }
}
