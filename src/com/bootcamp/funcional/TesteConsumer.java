package com.bootcamp.funcional;

import java.util.function.Consumer;

public class TesteConsumer {
    public static void main(String[] args) {
        //imprime na tela
        Consumer<String> consumerUm = valor -> System.out.println(valor);
        Consumer<String> consumerDois = System.out::println;

        consumerUm.accept("Olá mundo!");
        consumerDois.accept("Hello World!");
    }
}
