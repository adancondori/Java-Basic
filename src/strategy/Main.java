package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setEstrategia(new Atacar());
        context.ejecutarEstrategia();
        context.setEstrategia(new Defender());
        context.ejecutarEstrategia();

    }
}
