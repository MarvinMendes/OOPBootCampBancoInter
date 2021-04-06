package com.bootcamp.exercicios;


/*
* Crie um Set e execute as seguintes operações
* adicione 5 numeros inteiros: 3,88,20,44,3
* navegue no Set exibindo cada número no console
* remova o primeiro item do Set
* adicione um novo número no Set: 23
*verifique o tamanho do Set
* verifique se o Set está vazio
* */


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesteExercicioSet {
    public static void main(String[] args) {

        Set<Integer> conjuntos = new HashSet<>();

        conjuntos.add(3);
        conjuntos.add(88);
        conjuntos.add(20);
        conjuntos.add(44);
        conjuntos.add(3);

        conjuntos.forEach(System.out::println);

        conjuntos.remove(3);
        System.out.println("Primeiro elemento removido");
        conjuntos.forEach(System.out::println);

        conjuntos.add(23);
        System.out.println("\nAdicionando o número 23");
        conjuntos.forEach(System.out::println);

        //verificando se o set está vazio
        System.out.println(conjuntos.isEmpty());
        //limpando o set
        conjuntos.clear();
        System.out.println("O Set está vazio? " + conjuntos.isEmpty());

        //trabalhando com o LinkedHashSet
        LinkedHashSet<Integer> conjuntoOrdenado = new LinkedHashSet<>();
        conjuntoOrdenado.add(3);
        conjuntoOrdenado.add(88);
        conjuntoOrdenado.add(20);
        conjuntoOrdenado.add(44);
        conjuntoOrdenado.add(3);

        for(Integer numero : conjuntoOrdenado) {
            System.out.println("Conjunto Ordenado -> " + numero);
        }

        //removendo o primeiro item do Set
        conjuntoOrdenado.remove(3);
        System.out.println("\n removendo o primeiro item...");
        conjuntoOrdenado.forEach(System.out::println);


    }

}
