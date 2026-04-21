import monstros.MonstroObservavel;
import monstros.MonstrosFactory;


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

    }
}