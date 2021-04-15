package com.bootcamp.funcional;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = Pessoa::new;
        System.out.println(supplier.get());
    }
}

class Pessoa {
    String nome;
    String anoNascimento;
    public Pessoa() {
        this.nome = "Marvin";
        this.anoNascimento = "1993";
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Ano de nascimento: " + this.anoNascimento ;
    }
}