package com.ejemplo;

import java.util.Base64;

public class Calculator {
	public static long factorial(long n) {
	    if (n < 0) {
	        throw new IllegalArgumentException("Numeros negativos no son permitidos");
	    }
	    if (n == 0) return 1;
	    return n * factorial(n - 1);
	}

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n && n != 1;
    }

    public static String toBase64(int n) {
        return Base64.getEncoder().encodeToString(String.valueOf(n).getBytes());
    }
}