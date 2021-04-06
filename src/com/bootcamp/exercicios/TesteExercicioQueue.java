package com.bootcamp.exercicios;

/*
* Crie uma fila e execute as seguintes operações
* adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
* navegue na fila exibindo os nomes no console
* retorne o primeiro item da fila, sem remove-lo
* retorne o primeiro item da fila, removendo-o
* adicione um novo nome. verifique a posição que o mesmo assumiu na fila
* retorne o tamnho da lista
* verifique se a lista esta vazia
* verifique se um nome x esta na lista
* */

import java.util.LinkedList;
import java.util.Queue;

public class TesteExercicioQueue {
    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //exibindo nomes no console
        nomes.forEach(System.out::println);
        //de outra maneira
        for(String nome : nomes) {
            System.out.println("Nome -> " + nome);
        }
        //retorne o primeiro item da fila, sem remove-lo
        System.out.println("Primeiro nome da fila -> " + nomes.peek());
        System.out.println("\n");
        nomes.forEach(System.out::println);

        //retorne o primeiro item da fila, removendo-o
        System.out.println("\nPrimeiro nome da fila sendo removido -> " + nomes.poll());
        nomes.forEach(System.out::println);

        //adicionando um novo nome à fila
        nomes.add("Marvin");
        System.out.println("\nLista com um novo nome");
        nomes.forEach(System.out::println);

        //tamanho da lista
        System.out.printf("O tamanho da lista é: %s", nomes.size());

        //verificando se a lista esta vazia
        System.out.println("A lista está vazia? " + nomes.isEmpty());

        //verifica se um nome está na lista
        System.out.printf("\nO nome = 'Marvin' está contido na lista? %s", nomes.contains("Marvin"));

        //limpando a lista
        nomes.clear();
        System.out.println("\nA lista de nomes está vazia? " + nomes.isEmpty());
    }

}
