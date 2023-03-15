import java.util.Scanner;

public class NotasAlumnosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la nota del examen que has obtenido: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 1, 2, 3, 4 -> System.out.println("Suspenso, necesitas esforzarte un poquito más");
            case 5 -> System.out.println("Por los pelos, intenta no bajar el ritmo");
            case 6, 7, 8 -> System.out.println("Buen trabajo, a seguir mejorando");
            case 9, 10 -> System.out.println("Fenomenal! Estoy orgulloso de ti!");
        }
    }
}