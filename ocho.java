import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        int[] numeros = recibirNumerosPorTeclado();

        if (numeros.length == 0) {
            System.out.println("No se introdujeron números.");
            return;
        }

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }

    public static int[] recibirNumerosPorTeclado() {
        Scanner scanner = new Scanner(System.in);
        int capacidad = 10;
        int[] numeros = new int[capacidad];
        int indice = 0;

        System.out.println("Introduce números enteros (introduce 0 para terminar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }

            if (indice == capacidad) {
                capacidad *= 2;
                numeros = aumentarCapacidad(numeros, capacidad);
            }

            numeros[indice] = numero;
            indice++;
        }

        return reducirCapacidad(numeros, indice);
    }

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }

    public static int calcularMinimo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    public static int calcularMaximo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    public static int[] aumentarCapacidad(int[] array, int nuevaCapacidad) {
        int[] newArray = new int[nuevaCapacidad];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static int[] reducirCapacidad(int[] array, int nuevaLongitud) {
        int[] newArray = new int[nuevaLongitud];
        System.arraycopy(array, 0, newArray, 0, nuevaLongitud);
        return newArray;
    }
}

