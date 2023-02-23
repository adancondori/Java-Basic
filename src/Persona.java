public class Persona {
    private int altura = 0;
    private String nombre = "Hola";
    public String phone;
    public String code_country;

    //create table (name varchar(50))
    //int
    //string
    //boolean
    //list
    //long
    // var String hola = ""

    public Persona() {
        this.nombre="";
    }

    public Persona(int altura, String nombre) {
        this.altura=altura;
        this.nombre=nombre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setName(String newName){
        this.nombre=newName;
    }

    public String getAttributes() {
        return this.nombre + " - " + this.altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getNumber(int x) {
        int d = 1;
        for (int i = 1; i <= x; i++) {
            System.out.println(d);
            d=d+1;
        }
        return d;
    }

}
