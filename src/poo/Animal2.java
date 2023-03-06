package poo;

// Clase base o clase padre
public class Animal2 {
    protected String nombre;
    protected int edad;

    public Animal2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println("Haciendo sonidos...");
    }
}

// Clase principal
