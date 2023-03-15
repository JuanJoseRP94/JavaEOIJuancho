import java.util.Scanner;

public class LoginAplicacion {
    public static void main(String[] args) {
        // Definir usuario y contraseña
        // Solicitar usuario y contraseña por consola
        // Usar solo métodos de String y lógicos
        // El resultado debe ser true si las credenciales introducidas
        //coinciden con los datos válidos

        Scanner sc = new Scanner(System.in);
        String usuario = "Juancho";
        String password = "1234";

        System.out.println("Introduce nombre de usuario: ");
        String usuario2 = sc.nextLine();
        System.out.println("Introduce contraseña: ");
        String password2 = sc.nextLine();

        boolean permiso = (usuario.equals(usuario2)) && (password.equals(password2));

        System.out.println("Tienes permiso para entrar?: ");
        System.out.println(permiso);
    }
}