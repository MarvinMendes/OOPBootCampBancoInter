package com.bootcamp.funcional;

import jdk.jshell.EvalException;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //praticando Function
        Function<String, String> nomeAoContrario = valor -> new StringBuilder(valor).reverse().toString();
        System.out.println(nomeAoContrario.apply("Marvin"));

        Function<String, Integer> converteStringParaInteger = valor -> Integer.parseInt(valor);
        System.out.println(converteStringParaInteger.apply("13"));

        Function<String, Integer> converteERetornaODobro = value -> Integer.valueOf(value) * 2;
        System.out.println(converteERetornaODobro.apply("7"));
    }

}
