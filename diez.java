import java.util.Scanner;

public class diez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int tamaño = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(tamaño);

        System.out.println("La matriz simétrica generada es:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static int[][] generarMatrizSimetrica(int tamaño) {
        int[][] matriz = new int[tamaño][tamaño];


        for (int i = 0; i < tamaño; i++) {
            for (int j = i; j < tamaño; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }


        for (int i = 0; i < tamaño; i++) {
            for (int j = i + 1; j < tamaño; j++) {
                matriz[j][i] = matriz[i][j];
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

