import java.util.Arrays;

public class OrdenacionInversa {
    public static void main(String[] args) {

        int[] numeros = {9, 14, 12, 34, 6, 2, 1, 6, 2};
        String[] nombres = {"Juancho", "Diego", "Alejandro", "Santiago", "Alba"};
        ordenInverso(numeros);
        System.out.println("---------");
        ordenInversoNombres(nombres);
    }

    public static void ordenInverso(int[] numerosOrden) {
        // Devuelve la matriz ordenada de mayor a menor
        Arrays.sort(numerosOrden);
        for (int i = numerosOrden.length - 1; i >= 0; i--) {
            System.out.print(numerosOrden[i] + "-");
        }
    }

    public static void ordenInversoNombres(String[] nombresOrden) {
        // Devuelve la matriz ordenada de mayor a menor
        Arrays.sort(nombresOrden);
        for (int i = nombresOrden.length - 1; i >= 0; i--) {
            System.out.print(nombresOrden[i] + "-");
        }
    }
}