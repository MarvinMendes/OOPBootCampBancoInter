package com.bootcamp;

import com.bootcamp.exercicios.Carro;
import com.bootcamp.exercicios.Pessoa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        //praticas com funcional
        IntStream.range(1, 10)
                .forEach(System.out::println);

        String[] nomes = new String[] {"Marvin", "Ana", "Anna", "Sofia", "Kelvin", "Marcelo", "Ava"};
        Stream.of(nomes).filter(x -> x.startsWith("A"))
                .findFirst().map(x -> x)
                .ifPresent(System.out::println);

        Path path = Paths.get("C:/Users/marvi/Desktop/bandas.txt");
        byte[] bandas = Files.readAllBytes(path);
        String bandasParaTexto = new String(bandas);
        Stream.of(bandasParaTexto).sorted().forEach(x -> System.out.println("Existem " + x.lines().count() + " registros no documento" + " - Banda :: " + x));

        System.out.println("lendo com o files.lines");
        Stream<String> bandasDeRock = Files.lines(path);
        bandasDeRock.sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bandasDeRock.close();
        //reduce
        Double[] numeros = new Double[] {7.2, 3.8, 4.25, 5.75 };
        Double numerosComReduce = Stream.of(numeros).reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Números com o Reduce { " + numerosComReduce + " }");
    }
}
