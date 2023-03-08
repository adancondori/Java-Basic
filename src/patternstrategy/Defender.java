package patternstrategy;

public class Defender implements InterfaceJuego{


    @Override
    public void jugar(int cant) {
        System.out.println("Equipo defendiendo " + String.valueOf(cant));
    }
}
