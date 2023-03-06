package poo;

public class MainExtend {
    public static void main(String[] args) {
        Animal perro = new Perro("Tarzan");
        perro.color = "negro";
        System.out.println(perro.nombre);
        perro.emitirSonido();

        Gato gato = new Gato("felix");
        gato.emitirSonido();
    }
}
