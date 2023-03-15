import java.util.Scanner;

public class EjemploDNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame los 8 números de tu DNI");
        int dni = sc.nextInt();
        int resultado = dni%23;
        String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String solucion = letra[resultado];
        System.out.println("Tu DNI es " + dni + solucion);
    }
}