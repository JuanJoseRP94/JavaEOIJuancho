import java.util.Scanner;

public class LoginConIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "Juancho";
        String password = "1234";
        System.out.println("Introduce el nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce la contraseña");
        String clave = sc.nextLine();
        boolean login = usuario.equals(nombre) && clave.equals(password);
        if (login){
            System.out.println("Bienvenido a la plataforma, un placer tenerte por aquí " + usuario);
        } else {
            System.out.println("Usuario o contraseña introducidos incorrectos...");
        }
    }
}
