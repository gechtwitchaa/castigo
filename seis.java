import java.util.Arrays;

public class seis {
    public static void main(String[] args) {
        int N = 10;
        int[] primerosPrimos = encontrarPrimos(N);

        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    public static int[] encontrarPrimos(int N) {
        int[] primos = new int[N];
        int contador = 0;
        int numero = 2;

        while (contador < N) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
