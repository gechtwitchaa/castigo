import java.util.ArrayList;
import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.size(); i++) {
            System.out.print(factoresPrimos.get(i));
            if (i != factoresPrimos.size() - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }

    public static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;

        while (numero > 1) {
            if (numero % divisor == 0) {
                factoresPrimos.add(divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }

        return factoresPrimos;
    }
}

