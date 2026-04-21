import monstros.*;

public class MonstrosFactory {
    private String tipoMonstro;


    public static MonstroObservavel CreateMonstro(String tipoMonstro){
        switch (tipoMonstro){
            case "Orc":
                return (MonstroObservavel) new Orc();
            case "Goblin":
                return (MonstroObservavel) new Goblin();
            case "Dragão":
                return (MonstroObservavel) new Dragao();
            default:
                System.out.println("Não existe esse monstro");
                break;
        }
        ///nunca vai ocorrer mas ok
        return null;
    }

}
