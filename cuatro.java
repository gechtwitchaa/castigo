import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de números enteros positivos (introduce un número negativo para terminar):");

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        do {
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
            }

        } while (numero >= 0);

        if (minimo == Integer.MAX_VALUE || maximo == Integer.MIN_VALUE) {
            System.out.println("No se ha introducido ningún número positivo.");
        } else {
            System.out.println("El mínimo de la lista es: " + minimo);
            System.out.println("El máximo de la lista es: " + maximo);
        }

        scanner.close();
    }
}
