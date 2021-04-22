package internal;

public class SubtraiHelper implements Operacao{
    @Override
    public Long executa(Long a, Long b) {
        return a - b;
    }
}
