package java_poo;

public class Pato extends Animal implements IMetodo, IZoo{

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println("Pato Caminando");
    }

    @Override
    public void imprimirNombre() {
        System.out.println(this.nombre);
    }
}
