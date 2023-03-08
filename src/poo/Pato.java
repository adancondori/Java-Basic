package poo;

public class Pato extends Animal implements IMetodosAnimal{
    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Sonido Miu miu");
    }


    @Override
    public void obtenerRaza() {
        System.out.println("Raza siames");
    }

    @Override
    public String obtenerRaza2(int nroPatas) {
        return "DSAFASD";
    }
}
