package com.bootcamp.exercicios;

public class Gerente extends Funcionario {

    public Gerente(String nome, int dia, int mes, int ano, String cpf, Double salario) {
        super(nome, dia, mes, ano, cpf, salario);
    }

    @Override
    Double calculaImposto() {
        return getSalario() * 0.1;
    }
}
