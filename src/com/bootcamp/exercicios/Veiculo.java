package com.bootcamp.exercicios;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private Double valorVenal;

    public Veiculo(String modelo, String marca, Double valorVenal) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public void acelera() {
         System.out.println("Acelerando...");
    }

    public void freia() {
        System.out.println("Freiando");
    }

    public Double calculaIPVA() {
        return valorVenal * 0.01;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", valorVenal=" + valorVenal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, valorVenal);
    }
}
