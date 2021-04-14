package com.bootcamp.funcional;

public class HighOrderFunction {
    public static void main(String[] args) {
        Calculo soma = (x,y) -> x + y;
        System.out.println(executaOperacao(soma, 5, 9));
    }

    public static int executaOperacao(Calculo calculo, int x, int y) {
        return calculo.calcular(x, y);
    }

    @FunctionalInterface
    public interface Calculo {
       public int calcular(int x, int y);
    }
}
