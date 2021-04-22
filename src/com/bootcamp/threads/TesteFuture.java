package com.bootcamp.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class TesteFuture {
    private static final ExecutorService pessoaParaFazerAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<String>> futureList = new CopyOnWriteArrayList<Future<String>>(casa.getAtividadesDaCasa().stream()
                .map(atividade -> pessoaParaFazerAtividade.submit(() -> {
                    try {
                        return atividade.realiza();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    return null;
                }))
                .collect(Collectors.toList()));

        while (true) {
            int atividadesNaoFinalizadas = 0;

            for (Future<?> future : futureList) {
                if (future.isDone()) {
                    try {
                        System.out.println("Parabéns você terminou de " + future.get());
                        futureList.remove(future);
                    }catch (InterruptedException exception) {
                        exception.printStackTrace();
                    } catch (ExecutionException executionException) {
                        executionException.printStackTrace();
                    }
                }
                else {
                    atividadesNaoFinalizadas++;
                }
            }
            if (futureList.stream().allMatch(Future::isDone)) {
                break;
            }
            Thread.sleep(500);
        }
        pessoaParaFazerAtividade.shutdown();

    }

}

interface Atividade {
    String realiza() throws InterruptedException;
}
abstract class Comodo {
    abstract List<Atividade> getAtividadesDoComodo();
}

class Casa {
    List<Comodo> comodos;

    public Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }
