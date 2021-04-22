package main;

import com.java.modular.module.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma de 10 + 7 = " + calculadora.soma(10l, 7l));
        System.out.println("Subtração de 10 - 7 = " +         calculadora.subtrai(10l, 7l));
        System.out.println("Multiplicação de 10 x 7 = " + calculadora.multiplica(10l, 7l));
        System.out.println("Divisão 100 / 5 = " + calculadora.divide(100l, 5l));
    }
}
