package patternstrategy;

public class JuegoContexto {
    public InterfaceJuego estragia;

    public InterfaceJuego getEstragia() {
        return estragia;
    }

    public void setEstragia(InterfaceJuego estragia) {
        this.estragia = estragia;
    }

    public void ejecutarAccion(int cant){
        this.estragia.jugar(cant);
    }
}
