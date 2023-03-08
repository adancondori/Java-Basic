package strategy;

public class Atacar implements IEstrategia {
    public void atacar() {
        System.out.println("Equipo Atacando");
    }

    @Override
    public void play() {
        atacar();
    }
}
