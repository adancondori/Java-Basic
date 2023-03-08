package strategy;

public class Defender implements IEstrategia {
    public void defender() {
        System.out.println("Equipo defendiendo");
    }

    @Override
    public void play() {
        defender();
    }
}
