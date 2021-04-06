package com.bootcamp.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Crie uma lista e execute as seguintes operações
 *adiciona 5 nomes: Juliana, Pedro, Carlos, Larissa e João
 *navegue na lista exibindo cada nome no console
 * substitua o nome Carlos por Roberto
 * retorne o nome da posicao 1
 * remova o nome da posicao 4
 * remova o nome de João
 * retorne a quantidade de itens na lista
 * crie uma nova lista com os nomes: Ismael e Rodrigo
 * adicione todos os itens da nova lista na primeira lista criada
 * ordene os itens da lista por ordem alfabetica
 * verifique se a lista esta vazia*/


public class TesteExercicioListas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        nomes.forEach(System.out::println);

        nomes.set(2, "Roberto");
        System.out.println("\nFor Loop \n");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Nome na posição 1 => " + nomes.get(1));
        nomes.remove(4);

        System.out.println("\nPrint com Iterator \n");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        nomes.add("João");
        iterator = nomes.iterator();
        System.out.println("\nPrint com Iterator depois de adionar João na lista \n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        nomes.remove("João");
        System.out.println("\nremovendo João...");
        nomes.forEach(System.out::println);

        System.out.printf("\nA quantidade de itens na lista é de: %s", nomes.size());

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println("\nNOVA LISTA");
        novaLista.forEach(System.out::println);

        //adcionando todos os itens da nova lista à lista anterior
        nomes.addAll(novaLista);
        System.out.println("\nLista de nomes atualizada");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        var nomesOrdenados = nomes.stream().sorted();
        System.out.println("\nNomes ordenados");
        nomesOrdenados.forEach(System.out::println);
        //outro metodo de ordenar uma lista
        Collections.sort(nomes);
        System.out.println("\nordenando com o Collections.sort");
        nomes.forEach(System.out::println);

        //verificando se a lista está vazia
        System.out.println(nomes.isEmpty());

        //limpando a lista
        nomes.clear();
        System.out.println(nomes.isEmpty());
    }


}
