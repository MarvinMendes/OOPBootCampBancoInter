package com.bootcamp.exercicios;

import java.math.BigDecimal;

public class Veiculo {
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
}
