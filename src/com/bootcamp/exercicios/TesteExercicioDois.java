package com.bootcamp.exercicios;

public class TesteExercicioDois {
    //Estudando construtores
    /*Proposta do exercício
    Criar uma classe carro com os atributos:
    Marca: String
    Modelo: String
    Ano: Integer
    Variante: String
    Essa classe deve garantir que Modelo, Marca e Ano sempre sejam passadas na hora de instanciar um objeto
     */

    public static void main(String[] args) {
        var fiatCinquecento = new Carro("500", "Fiat", 2021);

        var pessoa = new Pessoa("Marvin");
        var pessoaDois = new Pessoa("Marcelo");

        fiatCinquecento.adicionaPessoa(pessoa);
        System.out.println(fiatCinquecento);

        fiatCinquecento.adicionaPessoa(pessoaDois);
        System.out.println(fiatCinquecento);
        //removendo pessoas
        System.out.println("Removendo pessoa...");
        fiatCinquecento.removePessoa(pessoaDois);
        System.out.println(fiatCinquecento);

    }

}
