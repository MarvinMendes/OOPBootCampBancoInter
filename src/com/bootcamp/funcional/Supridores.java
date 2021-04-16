package com.bootcamp.funcional;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = Pessoa::new;
        System.out.println(supplier.get());
    }
}

class Pessoa {
    private String nome;
    private String anoNascimento;

    public Pessoa() {

    }

    public Pessoa(String nome, String anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }



    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Ano de nascimento: " + this.anoNascimento ;
    }
}