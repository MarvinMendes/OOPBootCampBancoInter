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


        /*com recursividade até um certo número de registros - testei com 1000 (mil) registros e foi mas performático com recursividade, uma casa decimal acima e já não se tornou mais viável -
         vale a pena utilizar
         mas se for um número alto vai estourar a pilha de execução
        * */
        System.out.println("Testando recursividade com parallel");
        inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(num -> fatorialRecursivo(num));
        fim = System.currentTimeMillis();
        System.out.println("O tempo de execução de um Parallel em recursividade foi de: " + (fim -inicio));
    }

    public static long fatorial(long numero) {
        long fatorial =1;
        for (long i =2; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static long fatorialRecursivo(long numero) {
        if (numero == 0 ) {
            return 1;
        }
        return numero * fatorialRecursivo(numero -1);
    }

}
