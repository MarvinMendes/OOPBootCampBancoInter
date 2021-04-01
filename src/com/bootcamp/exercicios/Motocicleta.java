package com.bootcamp.exercicios;

public class Motocicleta extends Veiculo{
    private String cilindrada;

    public Motocicleta(String modelo, String marca, String cilindrada, Double valorVenal)
    {
        super(modelo, marca, valorVenal);
        this.cilindrada = cilindrada;
    }

    @Override
    public Double calculaIPVA() {
        return getValorVenal() * 0.05;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindrada='" + cilindrada + '\'' + "modelo= " + getModelo() + " marca= " + getMarca() +
                '}';
    }
}
