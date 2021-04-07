package com.bootcamp.exercicios;

/*
* Crie um Map e execute as seguintes operações
* adicione os 26 estados brasileiros no map, onde a sigla é a chave e o nome do estado o valor
* remova o estado de minas gerais
* adicione o distrito federal
* verifique o tamanho do mapa
* remova o estado de mato grosso do sul usando o nome
*navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
* verifique se o estado de santa catarina existe no map buscando por sua sigla
* verifique se o estado de maranhão existe no map buscando por seu nome
* */

import java.util.HashMap;
import java.util.Map;

public class TesteExercicioMap {
    public static void main(String[] args) {
        Map<String, String> estadosMap = new HashMap<>();

        estadosMap.put("AC", "Acre");
        estadosMap.put("AL", "Alagoas");
        estadosMap.put("AP", "Amapá");
        estadosMap.put("AM", "Amazonas");
        estadosMap.put("BA", "Bahia");
        estadosMap.put("CE", "Ceará");
        estadosMap.put("ES", "Espírito Santo");
        estadosMap.put("GO", "Goiás");
        estadosMap.put("MA", "Maranhão");
        estadosMap.put("MT", "Mato Grosso");
        estadosMap.put("MS", "Mato Grosso do Sul");
        estadosMap.put("MG", "Minas Gerais");
        estadosMap.put("PA", "Pará");
        estadosMap.put("PB", "Paraíba");
        estadosMap.put("PR", "Paraná");
        estadosMap.put("PE", "Pernambuco");
        estadosMap.put("PI", "Piauí");
        estadosMap.put("RJ", "Rio de Janeiro");
        estadosMap.put("RN", "Rio Grande do Norte");
        estadosMap.put("RO", "Rondônia");
        estadosMap.put("RR", "Roraima");
        estadosMap.put("SC", "Santa Catarina");
        estadosMap.put("SP", "São Paulo");
        estadosMap.put("SE", "Sergipe");
        estadosMap.put("To", "Tocantins");

        for (Map.Entry<String, String> estado : estadosMap.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        //removendo MG
        estadosMap.remove("MG");
        System.out.println("\nremovendo o estado de Minas Gerais");
        for (Map.Entry<String, String> estado : estadosMap.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }
        System.out.println("O estado de MG - Minas Gerais está cadastrado no MAP? " + estadosMap.containsKey("MG"));;

        //adicionando o Distrito Federal
        estadosMap.put("DF", "Distrito Federal");
        System.out.println("\nadicionando o Distrito Federal...");
        for (Map.Entry<String, String> estado : estadosMap.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }
        System.out.println("O Distrito Federal - DF, está cadastrado no MAP? " + estadosMap.containsKey("DF"));;

        //formatando saída de dados no console
        for(Map.Entry<String, String> estado : estadosMap.entrySet())
        {
            System.out.printf("\nNOME: %s | SIGLA: %s\n", estado.getValue(), estado.getKey());
        }

        //verificando se existe um estado buscando por sua sigla
        System.out.println(estadosMap.containsKey("SC"));

        //verificando se existe um estado buscando por seu nome
        System.out.println(estadosMap.containsValue("Maranhão"));
    }

}
