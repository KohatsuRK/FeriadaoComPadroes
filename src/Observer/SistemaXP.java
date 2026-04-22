package Observer;

import monstros.Monstro;
import monstros.MonstroObserver;

import java.time.Instant;

import static Observer.NucleoMasmorraSingleton.instancia;

public class SistemaXP implements MonstroObserver {
    private int totalXP = 0;

    @Override
    public void atualizar(Monstro monstro, String evento) {
        if ("morte".equals(evento)) {
            int xpGanho = switch (monstro.getNome()) {
                case "Goblin"       -> 50;
                case "Orc"         -> 150;
                case "Dragão (BOSS)" -> 1000;
                default            -> 25;
            };
            totalXP += xpGanho;
            System.out.printf("[SistemaXP] +%d XP por derrotar %s — total: %d XP%n",
                    xpGanho, monstro.getNome(), totalXP);
            instancia.getInstance().atualizarRecorde(totalXP);
        }
    }

    public int getTotalXP() { return totalXP; }
}
