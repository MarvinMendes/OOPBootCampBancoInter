package com.java.modular.module.utils;

import internal.DivideHelper;
import internal.MultiplicaHelper;
import internal.SomaHelper;
import internal.SubtraiHelper;

public class Calculadora {
    public SomaHelper somaHelper;
    public SubtraiHelper subtraiHelper;
    public MultiplicaHelper multiplicaHelper;
    public DivideHelper divideHelper;

    public Calculadora() {
        this.divideHelper = new DivideHelper();
        this.somaHelper = new SomaHelper();
        this.multiplicaHelper = new MultiplicaHelper();
        this.subtraiHelper = new SubtraiHelper();
    }

}
