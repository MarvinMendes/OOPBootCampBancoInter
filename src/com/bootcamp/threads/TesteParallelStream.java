package com.bootcamp.threads;

import java.util.stream.IntStream;

public class TesteParallelStream {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução sem um Parallel Stream foi de: " + (fim - inicio));


        /*
        parallel é muito mais performático que uma simples iteração pois utiliza
        o número total de threads do processador - 1 para executa o processo
        */
        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução com um Parallel Stream foi de: " + (fim - inicio));

    }

    public static long fatorial(long numero) {
        long fatorial =1;
        for (long i =2; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}
