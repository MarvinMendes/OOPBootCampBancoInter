package com.bootcamp.funcional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        //utilizando conceitos anteriores para iterar sobre arrays e collections
        String[] firstName = new String[] {"Marvin", "João", "Paulo", "Guilherme", "Ana", "Kelvin", "Sofia"};

        //iterando sobre array
        Stream.of(firstName).forEach(System.out::println);
        System.out.println("\n");
        //iterando sobre array com predicado
        String nomeBuscado = Stream.of(firstName).filter(nome -> nome.equals("Marvin")).collect(Collectors.joining());
        System.out.println("Nome buscado com predicado -> " + nomeBuscado);
        System.out.println("\n");


        //essa composição de classe aqui não faz o menor sentido mas eu precisava testar uma coisa
        var pessoaEProfissao = new ArrayList<Profissao>();
        Pessoa marvin = new Pessoa("Marvin", "1993");
        Pessoa paulo = new Pessoa("Paulo", "1980");
        Pessoa sofia = new Pessoa("Sofia", "1992");
        Pessoa ana = new Pessoa("Ana", "1999");
        Pessoa kelvin = new Pessoa("Kelvin", "2000");

        Profissao developer = new Profissao();
        developer.setNome("Developer");
        developer.setPessoa(Arrays.asList(marvin, sofia, ana));

        Profissao professor = new Profissao();
        professor.setNome("Professor");
        professor.setPessoa(Collections.singletonList(paulo));

        Profissao administrador = new Profissao();
        administrador.setNome("Administrador");
        administrador.setPessoa(Collections.singletonList(kelvin));


        //arrayList a iterar
        pessoaEProfissao.add(professor);
        pessoaEProfissao.add(developer);
        pessoaEProfissao.add(administrador);

        System.out.println("\n Filter para pegar profissão desenvolvedor");
        List<Profissao> developers = Stream.of(pessoaEProfissao).filter(profissaos -> developer.getNome().equals("Developer"))
                .map(profissaos -> developer)
                .collect(Collectors.toList());
        Stream.of(developers).forEach(System.out::println);

        System.out.println("\n Filter para pegar profissão professor");
        List<Profissao> professores = Stream.of(pessoaEProfissao).filter(profissaos -> professor.getNome().equals("Professor"))
                .map(profissaos -> professor)
                .collect(Collectors.toList());
        Stream.of(professores).forEach(System.out::println);

        System.out.println("Filter para pegar administradores...");
        Stream.of(pessoaEProfissao).filter(profissaos -> administrador.getNome().equals("Administrador"))
                .map(profissaos -> administrador)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class Profissao {
    private String nome;
    private List<Pessoa> pessoas = new ArrayList<>();

    public Profissao() {}

    public Profissao(String nome, Pessoa pessoa) {
        this.nome = nome;
        this.pessoas.add(pessoa);
    }


    public String getNome() {
        return nome;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoas = pessoa;
    }

    @Override
    public String toString() {
        return "Profissao{" +
                "Profissão='" + nome + '\'' +
                ", Pessoa=" + pessoas +
                '}';
    }
}
