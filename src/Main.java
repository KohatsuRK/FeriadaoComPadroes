import Adapter.*;
import Decorator.Arma;
import Decorator.EncatamentoFogo;
import Decorator.EncatamentoGelo;
import Decorator.Espada;
import Facade.ModoBatalha;
import Observer.NucleoMasmorraSingleton;
import Observer.PainelStatus;
import Observer.SistemaXP;
import SalaBoss.PortaoMagico;
import monstros.MonstroObservavel;
import monstros.MonstrosFactory;
import monstros.Orc;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Singleton
        NucleoMasmorraSingleton nucleo = NucleoMasmorraSingleton.getInstance();
        nucleo.setDificuldade(3);
        System.out.println("[Nucleo] Dificuldade global: " + nucleo.getDificuldade());

        // 2. Factory
        System.out.println("\n── Criando monstros via Factory ──");
        MonstroObservavel orc    = MonstrosFactory.CreateMonstro("Orc");
        MonstroObservavel goblin = MonstrosFactory.CreateMonstro("Goblin");

        // 8. Observer — registra os observers nos monstros
        PainelStatus painel = new PainelStatus();
        SistemaXP sistemaXP   = new SistemaXP();
        orc.adicionarObserver(painel);
        orc.adicionarObserver(sistemaXP);
        goblin.adicionarObserver(painel);
        goblin.adicionarObserver(sistemaXP);

        // 5. Facade
        System.out.println("\n── Iniciando encontro via Facade ──");
        ModoBatalha modoBatalha = new ModoBatalha();
        modoBatalha.iniciarEnconto(false);

        // 4. Adapter
        System.out.println("── Testando Adapters de entrada ──");
        Comando entradaTeclado  = new AdaptadorTeclado(new Teclado());
        Comando entradaControle = new AdaptadorControle(new ControleConsole());
        entradaTeclado.atacar();
        entradaControle.atacar();

        // 6. Decorator
        System.out.println("\n── Forjando espada com encantamentos (Decorator) ──");
        Arma espada = new Espada();
        espada = new EncatamentoFogo(espada);
        espada = new EncatamentoGelo(espada);
        System.out.println("Arma final: " + espada.getDescricao());
        System.out.println("Dano total: " + espada.calcularDano());

        // 7. Strategy + Observer
        System.out.println("\n── Combate com Strategy + Observer ──");
        orc.atacar();            // AtaqueFurioso (vida cheia)
        orc.tomarDano(50);       // vida baixa → troca strategy automaticamente
        ((Orc) orc).atacar();    // DefesaEstrategica
        goblin.tomarDano(999);   // Observer dispara: PainelDeStatus + SistemaXP notificados

        // 3. Proxy
        System.out.println("\n── Testando Proxy do PortaoMagico ──");
        PortaoMagico portao = new PortaoMagico();
        portao.entrar(5);        // nível insuficiente
        portao.entrar(15);       // nível suficiente
    }
}