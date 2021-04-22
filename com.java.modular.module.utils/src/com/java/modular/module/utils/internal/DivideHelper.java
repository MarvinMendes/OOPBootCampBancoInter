package com.java.modular.module.utils.internal;

public class DivideHelper implements Operacao{
    @Override
    public Long executa(Long a, Long b) {
        if (b == 0) {
            System.out.println("Não é possível divisão por zero");
            return 0L;
        }
        return a / b;
    }
}
