package com.bootcamp.funcional;

import java.util.function.Function;

public class HighOrderFunction {
    public static void main(String[] args) {
        Calculo soma = (x,y) -> x + y;
        System.out.println(executaOperacao(soma, 5, 9));
        //criando functions com lambda
        Function<Integer, Boolean> selecaoPar = (x) -> x % 2 == 0;
        Function<Integer, Boolean> selecaoImpar = (x) -> x % 2 != 0;
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("\n Só os pares!");
        ImprimeResultado(numeros,selecaoPar);
        System.out.println("\n Agora os ímpares!");
        ImprimeResultado(numeros,selecaoImpar);

        System.out.println("\nDe maneira diferente agora");

        /*A função ImprimeResultado ta esperando um função como parâmetro
        o que vamos fazer aqui é chamar uma outra função que vai receber um parâmetro
        e vai nos retornar uma função para preenchermos o parâmetro da nossa primeira funcção
        a ImprimeResultado :)
        show demais!!
        * */
        ImprimeResultado(numeros, RetornoDeFuncao("Par"));
        ImprimeResultado(numeros, RetornoDeFuncao("Ímpar"));

    }

    public static int executaOperacao(Calculo calculo, int x, int y) {
        return calculo.calcular(x, y);
    }

    @FunctionalInterface
    public interface Calculo {
       public int calcular(int x, int y);
    }
    @FunctionalInterface
    public interface Selecao{
        public Function<Integer, Boolean> seleciona(int x);
    }


    public static void ImprimeResultado(int[] numeros, Function<Integer, Boolean> selecao) {
        System.out.println("\nImprimindo números de um array conforme regra passada por seleção em uma função");
        for (Integer i =0; i< numeros.length; i++) {
            if (selecao.apply(numeros[i])){
                System.out.println(numeros[i]);
            }
        }
    }

    public static Function<Integer, Boolean> ExecutaSelecao(Selecao selecao, int i) {
        return selecao.seleciona(i);
    }

    //aqui pode rolar um NullPointer se não cair na validação
    public static Function<Integer, Boolean> RetornoDeFuncao(String regra) {
        System.out.println("HIGH ORDER FUNCTION ROLANDO GALERA");
        Function<Integer, Boolean> resultado = null;
        if (regra == "Par") {
            resultado = (x) -> x % 2 == 0;
        }else if (regra == "Ímpar") {
            resultado = (z) -> z % 2 != 0;
        }
        return resultado;
    }

}
