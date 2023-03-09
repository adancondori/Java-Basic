package poo;

import java_poo.IMetodo;

public class Pato extends  Biodiversidad implements IMetodosAnimal, IMetodo {
    public Pato(String nombre) {
        //super(nombre);
    }

    //@Override
    public void emitirSonido() {
        System.out.println("Sonido Miu miu");
    }


    @Override
    public void obtenerRaza() {
        System.out.println("Raza siames");
    }

    @Override
    public String obtenerRaza2(int nroPatas) {
        return "DSAFASD";
    }

    @Override
    public void caminar() {

    }

    @Override
    public void imprimirValor() {
        System.out.println("imprimir valor");
    }
}
