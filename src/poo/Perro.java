package poo;

public class Perro extends Animal implements IMetodosAnimal{

    public int nroDientes;
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

    @Override
    public String obtenerRaza2(int nroPatas) {
        return "DSAFASD";
    }


}
