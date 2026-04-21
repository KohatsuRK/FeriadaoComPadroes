package Adapter;

public class AdaptadorTeclado implements Comando{
    private Teclado teclado;

    public AdaptadorTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public void moverCima() {
        teclado.pressionarW();
    }

    @Override
    public void moverBaixo() {
        teclado.pressionarS();
    }

    @Override
    public void atacar() {
        teclado.pressionarEspaco();
    }
}
