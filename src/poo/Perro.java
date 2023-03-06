package poo;

public class Perro extends Animal implements IMetodosAnimal{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("sonido ladrar ladrar");
    }

    @Override
    public void obtenerRaza() {
        System.out.println("Raza Doberman");
    }
}
