package poo;

public class Gato extends Animal implements IMetodosAnimal{
    public Gato(String nombre) {
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
}
