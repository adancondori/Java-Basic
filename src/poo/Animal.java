package poo;

public class Animal {
    public String color = "";
    public String nombre = "";

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void emitirSonido() {
        System.out.println("Emitir Sonido.....");
    }
}
