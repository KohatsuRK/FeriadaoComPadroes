package Facade;

public class SistemaSom {
    public void tocarMusica(String faixa) {
        System.out.println("[SistemaSom] Tocando: " + faixa);
    }
    public void ajustarVolume(int volume) {
        System.out.println("[SistemaSom] Volume: " + volume);
    }
}
