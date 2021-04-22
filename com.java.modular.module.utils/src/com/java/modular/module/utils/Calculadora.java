package com.java.modular.module.utils;

import com.java.modular.module.utils.internal.DivideHelper;
import com.java.modular.module.utils.internal.MultiplicaHelper;
import com.java.modular.module.utils.internal.SomaHelper;
import com.java.modular.module.utils.internal.SubtraiHelper;

public class Calculadora {
    private SomaHelper somaHelper;
    private SubtraiHelper subtraiHelper;
    private MultiplicaHelper multiplicaHelper;
    private DivideHelper divideHelper;

    public Calculadora() {
        this.divideHelper = new DivideHelper();
        this.somaHelper = new SomaHelper();
        this.multiplicaHelper = new MultiplicaHelper();
        this.subtraiHelper = new SubtraiHelper();
    }

    public Long soma(Long a, Long b) {
        return somaHelper.executa(a, b);
    }

    public Long subtrai(Long a, Long b) {
        return subtraiHelper.executa(a, b);
    }

    public Long multiplica(Long a, Long b) {
        return multiplicaHelper.executa(a, b);
    }

    public Long divide(Long a, Long b) {
        return divideHelper.executa(a, b);
    }

}
