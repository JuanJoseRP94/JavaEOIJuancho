import java.util.Scanner;

public class MesAnio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        int numeroDias = 0;
        System.out.println("Introduce el año");
        int anio = sc.nextInt();
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> numeroDias = 31;
            case 4, 6, 9, 11 -> numeroDias = 30;
            case 2 -> {
                if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
            }
            default -> System.out.println("Mes incorrecto");
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}

