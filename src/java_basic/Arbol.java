package java_basic;

public class Arbol {
    public String nombre;
    public String color;
    public int altura;
    public boolean prueba;

    public Arbol(String nombre,String color, int altura) {
        this.nombre=nombre;
        this.altura=altura;
        this.color = color;
    }
    public int getAltura() {
        return this.altura;
    }
    public String getColor(){
        return this.color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(int altura) {
        if (altura > 3 || altura < 0) {
            System.out.println("Corregir la altura");
            this.altura=0;
        } else {
            this.altura = altura;
        }
    }

    public boolean isPrueba() {

        return prueba;
    }

    public void setPrueba(boolean prueba) {
        this.prueba = prueba;
    }

    public Arbol(String nombre, String color, int altura, boolean prueba) {
        this.nombre = nombre;
        this.color = color;
        this.altura = altura;
        this.prueba = prueba;
    }

    public String toString() {
        return  "Color es:" + color +" La altura es: " + altura;
        //return color + altura;
    }
}
