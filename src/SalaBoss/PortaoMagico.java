package SalaBoss;

public class PortaoMagico implements SalaDoBoss{
    private static final int nivelMin = 10;
    private SalaDoBoss salaDoBoss;

    public PortaoMagico(){
        this.salaDoBoss = new Rugal();
    }

    

    @Override
    public void entrar(int nivelJogador) {
        if (nivelJogador < nivelMin) {
            System.out.printf("[PortaoMagico] Acesso negado! Nível %d insuficiente (mínimo: %d).%n",
                    nivelJogador, nivelMin);
        } else {
            System.out.printf("[PortaoMagico] Nível %d aprovado. Abrindo o portão...%n", nivelJogador);
            salaDoBoss.entrar(nivelJogador);
        }
    }
}
