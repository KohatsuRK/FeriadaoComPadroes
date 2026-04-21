package Facade;

//comportamento monstro
public class SistemaIA {
    public void posicionarInimigos(String formacao) {
        System.out.println("[SistemaIA] Inimigos posicionados em formação: " + formacao);
    }
    public void ativarModoAlerta() {
        System.out.println("[SistemaIA] Modo alerta ativado — inimigos cientes do jogador.");
    }
}
