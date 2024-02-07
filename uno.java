public class uno {
    public static void main(String[] args) {
        int diasEnUnAno = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAno = calcularSegundosEnAno(1);

        System.out.println("El número de segundos en un año es: " + segundosEnUnAno);
    }

    public static int calcularSegundosEnAno(int anos) {
        int diasEnUnAno = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAno = anos * diasEnUnAno * horasEnUnDia * minutosEnUnaHora * segundosEnUnMinuto;

        return segundosEnUnAno;
    }
}


