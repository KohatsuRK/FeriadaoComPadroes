package Strategy;

import monstros.Monstro;

public class DefesaForte implements ComportamentoMonstro{
    @Override
    public void executar(Monstro monstro) {
        System.out.printf("[IA] %s adota DEFESA ESTRATÉGICA — recua e aguarda abertura (vida: %d).%n",
                monstro.getNome(), monstro.getVida());
    }
}
