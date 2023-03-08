package patternstrategy;

public class Esperar implements InterfaceJuego {

    @Override
    public void jugar(int cant) {
        System.out.println("Equipo esperar " + String.valueOf(cant));
    }
}
