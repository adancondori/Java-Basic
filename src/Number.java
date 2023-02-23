public class Number {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void getNumerosPares(int number) {
        for (int i = 1; i <= number; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
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

