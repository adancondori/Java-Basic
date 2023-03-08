package poo;

public class MainExtend {
    public static void main(String[] args) {
        Perro perro = new Perro("Tarzan");
        perro.color = "negro";
        perro.nroDientes = 32;
        perro.edad = 45;
        System.out.println(perro.nombre);
        perro.emitirSonido();

        Pato gato = new Pato("felix");
        gato.emitirSonido();
    }
}
