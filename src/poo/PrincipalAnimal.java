package poo;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Perro2 miPerro = new Perro2("Firulais", 3, "Labrador");

        System.out.println("Mi perro se llama " + miPerro.nombre);
        System.out.println("Tiene " + miPerro.edad + " años");
        System.out.println("Es de raza " + miPerro.raza);

        miPerro.emitirSonido();
        miPerro.ladrar();
    }
}
