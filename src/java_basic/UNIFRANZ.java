package java_basic;

public class UNIFRANZ {
    public void ejercicio0(int cantidad) {
        // 2,4,6,8,10, .....
        /*
        int par = 2;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println(par);
            par = par + 2;
        }
        */
        for (int i = 2; i / 2 <= cantidad; i = i + 2) {
            System.out.println(i);
        }
    }

    public void ejercicio1(int cantidad) {
        //4, 5, 9, 14, 23, 37
        int a = 3;
        int b = 1;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(a + b);
            int aux = b;
            b = aux + a;
            a = aux;
        }
    }

    public void ejercicio2(int cantidad) {
        //60, 1, 58, 3, 56, 5, 54, 7, 52, 9, 50, 11
        int aux1 = 60;
        int aux2 = 1;
        for (int j = 1; j <= cantidad; j++) {
            System.out.println((j % 2 != 0) ? aux1: aux2);
            if (j % 2 != 0) {
                aux1 = aux1 - 2;
            } else {
                aux2 = aux2 + 2;
            }
        }
    }
    public void ejercicio4(int cantidad){
        int aux=0;
        for (int i=0;i/2<cantidad;i=i+2){
            aux=i+aux;
            System.out.println(aux);
        }
    }

    public int ejercicioSumatoria(int cant) {
        // 2, 4, 6, 8, ....
        int par = 2;
        int auxiliar = 0;
        for (int i = 1; i <= cant; i++) {
            auxiliar += par;
            par += 2;
        }
        return auxiliar;
    }

    public int sumaEjercicio1(int cantidad){
        int aux=0;
        int base = 3;

        return aux;
    }
}
