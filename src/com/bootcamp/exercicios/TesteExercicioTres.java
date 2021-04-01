package com.bootcamp.exercicios;

public class TesteExercicioTres {
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
        System.out.println("\n****************************************************************************************");

        var gerente = new Gerente("Guilherme", 17, 03, 1980, "1231423421", 20000d);
        System.out.printf("\nO imposto que %s deve pagar e de: R$%.2f", gerente.getNome(), gerente.calculaImposto());

        var supervisor = new Supervisor("Fernando", 11, 01, 1978, "5345346123", 10000d);
        System.out.printf("\nO imposto que %s deve pagar e de: R$%.2f", supervisor.getNome(), supervisor.calculaImposto());

        var atendente = new Atendente("Victor", 29, 06, 1990, "5564464877", 5000d);
        System.out.printf("\nO imposto que %s deve pagar e de: R$%.2f", atendente.getNome(), atendente.calculaImposto());

    }

}
