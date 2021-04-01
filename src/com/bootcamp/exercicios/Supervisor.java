package com.bootcamp.exercicios;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int dia, int mes, int ano, String cpf, Double salario) {
        super(nome, dia, mes, ano, cpf, salario);
    }

    @Override
    Double calculaImposto() {
        return getSalario() * 0.05;
    }
}
