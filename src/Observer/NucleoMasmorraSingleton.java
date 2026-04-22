package Observer;

public class NucleoMasmorraSingleton {
    static NucleoMasmorraSingleton instancia;
    private int dificuldade;
    private int recorde;

    private NucleoMasmorraSingleton() {
        this.dificuldade   = 1;
        this.recorde   = 0;
    }



    public static NucleoMasmorraSingleton getInstance() {
        if (instancia == null) {
            instancia = new NucleoMasmorraSingleton();
        }
        return instancia;
    }

    public int getDificuldade()               { return dificuldade; }

    public void setDificuldade(int nivel)     { this.dificuldade = nivel; }

    public int getRecorde()                   { return recorde; }

    public void atualizarRecorde(int pontos) {
        if (pontos > recorde) {
            recorde = pontos;
            System.out.println("[Nucleo] Novo recorde registrado: " + pontos);
        }
    }
}
