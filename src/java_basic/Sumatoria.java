package java_basic;

public class Sumatoria {

    public int sumatoriaPares(int numero) {
        int auxiliar = 0;
        for (int i = 1; i <= numero; i++) {
            auxiliar = auxiliar +    i * 2;
        }
        return auxiliar;
    }

    public int sumatoria1(int numero){
        // 3 + 6 + 12 + 24 + 48
        // 45
        //     2    2    2   2
        int auxiliar = 3 ;
        int res = 3;
        for (int i = 0; i < numero -1; i++) {
            res = res * 2;
            auxiliar = auxiliar + res;
        }
        return auxiliar;
    }
}
