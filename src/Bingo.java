import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // Número extraido
        int[] numeros = new int[91];
        int contador = 0;
        boolean salir = false;

        System.out.println("Presiona una tecla para comenzar/seguir");
        // Sacar números del 1 al 90 sin que se repitan
        while (contador < 90 && !salir){
            // Controlar avance de la partida
            String tecla = sc.next();
            System.out.println("Presione s para salir");
            if (tecla.equals("s")){
                salir = true;
            }
            // Generar aleatorio del 1 al 90
            n = 1 + (int) (Math.random() * 90);
            // si no ha salido lo guardo
            if (numeros[n] == 0){
                numeros[n] = n;
                contador++;
                System.out.println("contador - n = " + contador + " - " + n);
            }
        }
        System.out.println("La partida ha terminado");
    }
}