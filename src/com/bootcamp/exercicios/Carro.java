package com.bootcamp.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Carro extends Veiculo{
    private int quantidadeDePessoas = 0;
    private List<Pessoa> ocupantes = new ArrayList<>();
    private Integer ano;
    private String variante;

    public Carro(String modelo, String marca, Integer ano, Double valorVenal) {
        super(modelo, marca, valorVenal);
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

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getVariante() {
        return variante;
    }

    @Override
    public Double calculaIPVA() {
        return getValorVenal() * 0.07;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadeDePessoas=" + quantidadeDePessoas +
                ", ocupantes=" + ocupantes +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + ano +
                ", variante='" + variante + '\'' +
                '}';
    }
}
