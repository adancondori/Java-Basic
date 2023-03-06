package poo;

public class AbstracPOO {
/*
public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
}

public abstract class FiguraBidimensional implements FiguraGeometrica {
    int cantidadLados;

    public FiguraBidimensional(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public int getCantidadLados() {
        return cantidadLados;
    }
}

public class Circulo extends FiguraBidimensional {
    double radio;

    public Circulo(double radio) {
        super(0); // Un círculo no tiene lados
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Cuadrado extends FiguraBidimensional {
    double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Circulo(5);
        FiguraGeometrica figura2 = new Cuadrado(3);

        System.out.println("Área de la figura 1: " + figura1.calcularArea());
        System.out.println("Perímetro de la figura 1: " + figura1.calcularPerimetro());
        System.out.println("Cantidad de lados de la figura 1: " + ((FiguraBidimensional) figura1).getCantidadLados());

        System.out.println("Área de la figura 2: " + figura2.calcularArea());
        System.out.println("Perímetro de la figura 2: " + figura2.calcularPerimetro());
        System.out.println("Cantidad de lados de la figura 2: " + ((FiguraBidimensional) figura2).getCantidadLados());
    }
}
* */
}
