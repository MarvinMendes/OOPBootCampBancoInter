package com.bootcamp.exercicios;


public abstract class Funcionario extends Pessoa {
    private String cpf;
    private Double salario;

    public Funcionario(String nome, int dia, int mes, int ano ,String cpf, Double salario) {
        super(nome, dia, mes, ano);
        this.cpf = cpf;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    abstract Double calculaImposto();

}
