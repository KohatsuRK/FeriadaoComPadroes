package Decorator;

public class EncatamentoDecorator implements Arma{
    protected Arma armaEncantada;

    public EncatamentoDecorator(Arma armaEncantada) {
        this.armaEncantada = armaEncantada;
    }

    @Override
    public int calcularDano() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return "";
    }
}
