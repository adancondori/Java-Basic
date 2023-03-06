package java_basic;

public class Number {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void getNumerosPares(int number) {
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void ejercicio1(int number) {
        int primero  = 3;
        int segundo = 1;
        for (int i = 1; i <= number; i++) {
            int pri = primero;
            primero = segundo;
            segundo = pri;
            segundo = primero + segundo;
            System.out.println(primero);
        }
    }
    public void ejercicio2(int numero) {
        int primero = 60;
        int segundo = 1;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0 ) {
                System.out.println(primero);
                primero = primero - 2;
            } else {
                System.out.println(segundo);
                segundo = segundo - 2;
            }
        }
    }

    //4, 5, 9, 14, 23, 37
    public String getEjercicio1(int numero) {
        int primero = 0;
        int segundo = 4;
        for (int i = 0; i < numero; i++) {

            int auxiliar = primero + segundo;
            primero = auxiliar;
            //segundo = segundo
            System.out.println(auxiliar);
        }
        return "";
    }
    public String tarea1(int n){
        int a = 4, b = 5, c = 0;
        String valor = "";
        for (int i = 1; i <= n; i++){
            valor = valor + a + ", ";
            c = a+b;
            a = b;
            b = c;
        }
        return valor;
    }


}
// genera la siguiente serie 2,4,6,8,10
// 4, 6, 9, 10, 14, 15, 21, 22, 25,.
// 1, 1, 3, 4, 5, 7, 7, 1081 + 2 + 3
/*
//1 + 3 = 4

3 + 2 + 5
4 + 3 + 7
*/

