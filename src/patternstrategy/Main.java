package patternstrategy;

public class Main {
    public static void main(String[] args) {
        JuegoContexto contexto = new JuegoContexto();
        contexto.setEstragia(new Atacar());
        contexto.ejecutarAccion(3);
        contexto.setEstragia(new Defender());
        contexto.ejecutarAccion(4);
        contexto.setEstragia(new Esperar());
        contexto.ejecutarAccion(11);
    }
}
