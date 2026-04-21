package Strategy;

import monstros.Monstro;

public class AtaqueFurioso implements ComportamentoMonstro{
    @Override
    public void executar(Monstro monstro) {
        System.out.printf("[IA] %s usa ATAQUE FURIOSO — avança sem parar!%n", monstro.getNome());
    }
}
