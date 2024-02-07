public class tres {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        int[] multiplosDe5 = obtenerMultiplosDe5(start, end);

        System.out.println("Los múltiplos de 5 comprendidos entre 1 y 100 son:");
        for (int num : multiplosDe5) {
            System.out.println(num);
        }

        int sumaMultiplosDe5 = sumarArray(multiplosDe5);
        System.out.println("La suma de los múltiplos de 5 es: " + sumaMultiplosDe5);
        System.out.println("El total de múltiplos de 5 es: " + multiplosDe5.length);
    }

    public static int[] obtenerMultiplosDe5(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        int[] multiplosDe5 = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                multiplosDe5[index] = i;
                index++;
            }
        }

        return multiplosDe5;
    }

    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}

