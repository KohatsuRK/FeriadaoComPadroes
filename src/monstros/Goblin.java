package monstros;

import Strategy.AtaqueFurioso;
import Strategy.ComportamentoMonstro;

import java.util.ArrayList;
import java.util.List;

class Goblin implements MonstroObservavel {

    private int vida = 30;
    private ComportamentoMonstro ia = new AtaqueFurioso();
    private final List<MonstroObserver> observers = new ArrayList<>();

    @Override public String getNome()    { return "Goblin"; }
    @Override public int    getVida()    { return vida; }
    @Override public boolean estaVivo()  { return vida > 0; }

    @Override
    public void atacar() { ia.executar(this); }

    @Override
    public void tomarDano(int dano) {
        vida = Math.max(0, vida - dano);
        System.out.printf("[%s] recebeu %d de dano — vida: %d%n", getNome(), dano, vida);
        if (!estaVivo()) notificarObservers("morte");
    }

    @Override public void adicionarObserver(MonstroObserver obs)   { observers.add(obs); }
    @Override public void removerObserver(MonstroObserver obs)     { observers.remove(obs); }
    @Override public void notificarObservers(String evento) {
        for (MonstroObserver obs : observers) obs.atualizar(this, evento);
    }
}
