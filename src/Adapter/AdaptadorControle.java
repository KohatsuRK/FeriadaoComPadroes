package Adapter;

public class AdaptadorControle implements Comando {
    private final ControleConsole controle;
    public AdaptadorControle(ControleConsole controle) { this.controle = controle; }

    @Override
    public void moverCima()  {
        controle.setinhaCima();
    }

    @Override
    public void moverBaixo() {
        controle.setinhaBaixo();
    }

    @Override
    public void atacar(){
        controle.BotaoX();
    }
}
 