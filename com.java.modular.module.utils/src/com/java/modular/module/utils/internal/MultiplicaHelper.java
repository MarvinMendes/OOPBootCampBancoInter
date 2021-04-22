package internal;

public class MultiplicaHelper implements Operacao{
    @Override
    public Long executa(Long a, Long b) {
        return a * b;
    }
}
