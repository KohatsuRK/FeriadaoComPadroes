package Observer;

import monstros.Monstro;
import monstros.MonstroObserver;

public class PainelStatus implements MonstroObserver {
    @Override
    public void atualizar(Monstro monstro, String evento) {
        if ("morte".equals(evento)) {
            System.out.printf("[PainelDeStatus]  %s foi derrotado! Atualizando HUD...%n",
                    monstro.getNome());
        }
    }
}
