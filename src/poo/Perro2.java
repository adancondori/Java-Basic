package poo;

// Clase derivada o clase hija
public class Perro2 extends Animal2 {
    public String raza;

    public Perro2(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("Ladrando...");
    }
}
