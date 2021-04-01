package com.bootcamp.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private int quantidadeDePessoas = 0;
    private List<Pessoa> ocupantes = new ArrayList<>();
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void adicionaPessoa(Pessoa pessoa) {
        ocupantes.add(pessoa);
        quantidadeDePessoas++;
    }
    public void removePessoa(Pessoa pessoa) {
        if (ocupantes.contains(pessoa)) {
            ocupantes.remove(pessoa);
            quantidadeDePessoas--;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadeDePessoas=" + quantidadeDePessoas +
                ", ocupantes=" + ocupantes +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", variante='" + variante + '\'' +
                '}';
    }
}
