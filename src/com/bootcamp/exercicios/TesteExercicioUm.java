package com.bootcamp.exercicios;

public class TesteExercicioUm {
    public static void main(String[] args) {

        /*Criar uma classe Carro. Nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro.
        E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro.
        */
        var pessoa = new Pessoa("Marvin", 20,02,1993);
        var pessoaDois = new Pessoa("Marcelo", 18, 02, 1984);

        var volvo = new Carro("C30", "VOLVO", 2013, 10000d);
        volvo.adicionaPessoa(pessoa);
        System.out.println(volvo);

        volvo.adicionaPessoa(pessoaDois);
        System.out.println(volvo);
        //removendo pessoas
        System.out.println("Removendo pessoa...");
        volvo.removePessoa(pessoaDois);
        System.out.println(volvo);

    }
}
