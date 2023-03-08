package java_poo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro("lalo");
        Pato pato1 = new Pato("luz");

        List<Animal> animales = new ArrayList<>();
        animales.add(perro1);
        animales.add(pato1);

        //List<Integer> enteros = new ArrayList<>();
        //enteros.add("String");

        Perro perro = new Perro("Lazy");
        perro.edad = 18;
        perro.color = "negro";
        perro.nroDientes = 9;
        System.out.println(perro.nombre);
        perro.emitirSonido();
        perro.caminar();

        Pato pato = new Pato("titi");
        pato.nombre = "hugo";
        pato.caminar();
        System.out.println(pato.nombre);
    }
}
