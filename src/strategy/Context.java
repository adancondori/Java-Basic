package strategy;

public class Context {
    public IEstrategia estrategia;

    public IEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarEstrategia() {
        this.estrategia.play();
    }
}
