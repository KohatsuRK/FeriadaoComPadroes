package monstros;

public interface Monstro {
    void atacar ();
    void tomarDano(int dano);
    boolean estaVivo();
    int getVida();
    String getNome();
}
