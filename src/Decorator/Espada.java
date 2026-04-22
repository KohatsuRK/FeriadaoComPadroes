package Decorator;

public class Espada implements Arma{
    @Override
    public int calcularDano() {
        return 30;
    }

    @Override
    public String getDescricao() {
        return "Katana básica";
    }

}
