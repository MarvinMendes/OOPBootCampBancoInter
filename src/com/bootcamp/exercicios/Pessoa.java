package com.bootcamp.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    

    public Pessoa(String nome, int dia, int mes, int ano) {

        this.nome = nome;
        dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
    public Integer getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

}
