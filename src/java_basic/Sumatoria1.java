package java_basic;

public class Sumatoria1 {
    public int ejercicio1(int numero){
        int aux = 0;
        for (int i = 1; i <= numero; i++) {
            aux = aux + i * 2;
        }
        return aux;
    }
}
