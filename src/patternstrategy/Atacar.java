package patternstrategy;

public class Atacar implements InterfaceJuego {

    public Atacar() {
    }

    @Override
    public void jugar(int cant) {
        System.out.println("Equipo Atacando " + String.valueOf(cant));
    }
}
