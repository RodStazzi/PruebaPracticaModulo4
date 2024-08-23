package com.ejemplo;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.function.Function;


/**
 * Hello world! 
 *
 */


public class App {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("||El nuevo 2.1.0 Group||");
        System.out.println("========================");

        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> cube = x -> x * x * x;
        Function<Integer, Long> factorial = Calculator::factorial;
        Function<Integer, Boolean> isPrime = Calculator::isPrime;
        Function<Integer, Integer> sumOfDigits = Calculator::sumOfDigits;
        Function<Integer, Boolean> isPerfect = Calculator::isPerfect;
        Function<Integer, String> toBinary = Integer::toBinaryString;
        Function<Integer, String> toBase64 = Calculator::toBase64;

        List<Integer> numeros = Arrays.asList(2, 5, 6, 8, 18, 34);

        for (int num : numeros) {
            System.out.println("Número a operar: " + num);
            System.out.println("El cuadrado de " + num + " es: " + square.apply(num));
            System.out.println("El cubo de " + num + " es: " + cube.apply(num));
            System.out.println("El factorial de " + num + " es: " + factorial.apply(num));
            System.out.println("¿Es " + num + " un número primo? " + isPrime.apply(num));
            System.out.println("La suma de los dígitos de " + num + " es: " + sumOfDigits.apply(num));
            System.out.println("¿Es " + num+ " un número perfecto? " + isPerfect.apply(num));
            System.out.println("La representación binaria de " + num + " es: " + toBinary.apply(num));
            System.out.println("La representación Base64 de " + num + " es: " + toBase64.apply(num));
            System.out.println("___________________________________________");
        }

        // Generar un número aleatorio y realizar las mismas operaciones
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        System.out.println("Número aleatorio generado: " + randomNum);
        System.out.println("El cuadrado de " + randomNum + " es: " + square.apply(randomNum));
        System.out.println("El cubo de " + randomNum + " es: " + cube.apply(randomNum));
        System.out.println("El factorial de " + randomNum + " es: " + factorial.apply(randomNum));
        System.out.println("¿Es " + randomNum + " un número primo? " + isPrime.apply(randomNum));
        System.out.println("La suma de los dígitos de " + randomNum + " es: " + sumOfDigits.apply(randomNum));
        System.out.println("¿Es " + randomNum+ " un número perfecto? " + isPerfect.apply(randomNum));
        System.out.println("La representación binaria de " + randomNum + " es: " + toBinary.apply(randomNum));
        System.out.println("La representación Base64 de " + randomNum + " es: " + toBase64.apply(randomNum));
    }
}