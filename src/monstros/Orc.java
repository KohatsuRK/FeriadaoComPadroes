package monstros;

import Strategy.AtaqueFurioso;
import Strategy.ComportamentoMonstro;
import Strategy.DefesaForte;

import java.util.ArrayList;
import java.util.List;

class Orc implements MonstroObservavel {

    private int vida = 80;
    private ComportamentoMonstro ia;
    private final List<MonstroObserver> observers = new ArrayList<>();

    public Orc() {
        this.ia = new AtaqueFurioso();  // comportamento inicial (Strategy)
    }

    @Override public String getNome()     { return "Orc"; }
    @Override public int    getVida()     { return vida; }
    @Override public boolean estaVivo()   { return vida > 0; }

    @Override
    public void atacar() {
        ia.executar(this);
        verificarEstado();
    }

    @Override
    public void tomarDano(int dano) {
        vida = Math.max(0, vida - dano);
        System.out.printf("[%s] recebeu %d de dano — vida: %d%n", getNome(), dano, vida);
        if (!estaVivo()) notificarObservers("morte");
    }

    /** Troca de strategy em runtime conforme o estado de saúde. */
    private void verificarEstado() {
        if (vida <= 40 && !(ia instanceof DefesaForte)) {
            System.out.println("[" + getNome() + "] vida baixa — mudando para Defesa Estratégica!");
            ia = new DefesaForte();
        }
    }

    public void setComportamento(ComportamentoMonstro novaIA) { this.ia = novaIA; }

    @Override public void adicionarObserver(MonstroObserver obs)    { observers.add(obs); }
    @Override public void removerObserver(MonstroObserver obs)      { observers.remove(obs); }
    @Override public void notificarObservers(String evento) {
        for (MonstroObserver obs : observers) obs.atualizar(this, evento);
    }
}