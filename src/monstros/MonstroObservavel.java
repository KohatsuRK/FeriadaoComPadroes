package monstros;

public interface MonstroObservavel extends Monstro{
    void adicionarObserver(MonstroObserver obs);
    void removerObserver(MonstroObserver obs);
    void notificarObservers(String evento);
}
