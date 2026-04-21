package Facade;

public class ModoBatalha {
    private final SistemaLuz  luz  = new SistemaLuz();
    private final SistemaSom  som  = new SistemaSom();
    private final SistemaIA   ia   = new SistemaIA();

    public void iniciarEnconto(boolean ehBoss) {
        System.out.println("--- [ModoBatalha] Preparando encontro ---");
        luz.ajustarLuz(ehBoss ? "baixa-dramática" : "normal");
        som.tocarMusica(ehBoss ? "tema-do-boss.ogg" : "batalha.ogg");
        som.ajustarVolume(ehBoss ? 90 : 70);
        ia.posicionarInimigos(ehBoss ? "circular-agressiva" : "linha-de-frente");
        ia.ativarModoAlerta();
        System.out.println("--- [ModoBatalha] Encontro iniciado! ---\n");
    }

    public void encerrarEnconto() {
        System.out.println("[ModoBatalha] Encontro encerrado. Restaurando estado normal.");
        luz.ajustarLuz("normal");
        som.tocarMusica("ambiente-masmorra.ogg");
    }
}
