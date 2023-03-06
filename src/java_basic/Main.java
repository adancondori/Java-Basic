package java_basic;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println();
        /*
        java_basic.Persona persona= new java_basic.Persona(2,"Juan");
        System.out.println(persona.getNombre()); // ???  Juan
        java_basic.Persona persona2= new java_basic.Persona();
        System.out.println(persona2.getNombre()); // ??? ""
        persona.getNumber(5);
        System.out.println("---------------"); // ??? ""
        persona.setAltura(2);
        java_basic.Mouse m=new java_basic.Mouse();
        */
        //System.out.println(persona.getNombre());
        //System.out.println(persona.getAttributes());
        //var eidan=9;
        //System.out.println(user.getNumber(10));
        Number number = new Number();
        number.getNumerosPares(10);
    }
}
/*

Ubicas la ruta de instalación del Open JDK y entras a la carpeta bin (Recordemos que estamos usando OpenJDK); En teoría esta en C:\Program Files\AdoptOpenJDK\jdk-8.0.232.09-hotspot\bin

Copia la ruta completa queda algo asi: C:\Program Files\AdoptOpenJDK\jdk-8.0.232.09-hotspot\bin

luego en el cuadro de búsqueda de Windows 10 (ubicado en la parte inferior izquierda) buscas “ver la configuración avanzada del sistema”

Posteriormente se abre un cuadro; entras; en la pestaña “opciones avanzadas” parte inferior encuentras el botón “Variables de entorno” entras hay, te aparece dos cuadros (te fijas en el inferior que se denomina Variables del sistema)

Ubicas la variable “Path” y le das en editar.

Si instalaste las dos versiones del JDK deberían aparecerte las dos así:
C:\Program Files\AdoptOpenJDK\jdk-8.0.232.09-hotspot\bin
C:\Program Files\AdoptOpenJDK\jdk-11.0.5.10-hotspot\bin

(Si no te aparecen debes incluir las rutas como se indica en el paso numero 1. picando en “Nuevo” y hay colocas las dos rutas de las dos versiones de los JDK instalados en el curso.)

Oprimes subir o bajar según la versión que quieras usar (es decir que la versión que deseas usar este de primero); en el lado derecho están los botones de subir y bajar.

abres una consola y revisas la versión con (java -versión) o (javac – versión)


 */