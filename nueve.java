import java.util.Scanner;

public class nueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();

        int[] vector1 = leerVectorPorTeclado(longitud);
        int[] vector2 = leerVectorPorTeclado(longitud);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    public static int[] leerVectorPorTeclado(int longitud) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[longitud];

        System.out.println("Ingrese los " + longitud + " elementos del vector separados por espacios:");

        for (int i = 0; i < longitud; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}

