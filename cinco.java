public class cinco {
    public static void main(String[] args) {
        int n = 10;
        int[][] tablasMultiplicar = generarTablasMultiplicar(n);

        for (int i = 0; i < tablasMultiplicar.length; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < tablasMultiplicar[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablasMultiplicar[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generarTablasMultiplicar(int n) {
        int[][] tablas = new int[n][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }
        return tablas;
    }
}
