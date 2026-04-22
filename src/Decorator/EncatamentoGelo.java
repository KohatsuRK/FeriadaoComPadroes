package Decorator;

public class EncatamentoGelo extends EncatamentoDecorator{
    public EncatamentoGelo(Arma armaEncantada) {
        super(armaEncantada);
    }

    @Override
    public int calcularDano() {
        return armaEncantada.calcularDano() + 10;  // +10 dano de gelo
    }

    @Override
    public String getDescricao() {
        return armaEncantada.getDescricao() + " [+Gelo]";
    }

}
