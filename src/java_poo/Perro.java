package java_poo;

public class Perro extends Animal implements IMetodo, IZoo{
    public int nroDientes=0;
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        //super.emitirSonido();
        System.out.println("Sonido ladrar...");
    }

    @Override
    public void caminar() {
        System.out.println("Perro Caminando");
    }

    @Override
    public void imprimirNombre() {
        System.out.println(this.nombre);
    }
}
