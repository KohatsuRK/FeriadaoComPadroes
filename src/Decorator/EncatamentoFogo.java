package Decorator;

public class EncatamentoFogo extends EncatamentoDecorator{
    public EncatamentoFogo(Arma armaEncantada) {
        super(armaEncantada);
    }

    @Override
    public int calcularDano() {
        return armaEncantada.calcularDano() + 15;  // +15 dano de fogo
    }

    @Override
    public String getDescricao() {
        return armaEncantada.getDescricao() + " [+Fogo]";
    }

}
