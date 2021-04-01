package com.bootcamp.exercicios;

public class ExercicioTres {
    /*Proposta de exercício
    *Criar três tipos de funcionários
    * Gerente, supervisor e atendente
    *Cada um tem uma política de impostos diferente
    *gerente paga 0,1% do salário
    *supervisor paga 0,05% do salário
    *atendente paga 0,01% do salário
    * */


    public static void main(String[] args) {
        var pessoa = new Pessoa("Marvin", 20, 02, 1993);
        System.out.println(pessoa.getIdade());

        var moto = new Motocicleta("Scrambler", "Ducati", "800cc", 50000d);
        moto.acelera();
        moto.freia();
        System.out.println(moto);
        System.out.printf("O valor do IPVA do veículo: %s é de: R$%.02f", moto.getModelo(), moto.calculaIPVA());

        System.out.println("\n****************************************************************************************");

        var carro = new Carro("XC60", "VOLVO", 2021, 200000d);
        carro.adicionaPessoa(pessoa);
        carro.setVariante("Cor Preta");
        carro.acelera();
        carro.freia();
        System.out.println(carro);
        System.out.printf("O valor do IPVA do veículo: %s é de: R$%.02f", carro.getModelo(), carro.calculaIPVA());

    }

}
