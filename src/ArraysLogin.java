import java.util.Scanner;

public class ArraysLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Juancho";
        passwords[0]= "12345";

        usernames[1] = "admin";
        passwords[1]= "12345";

        usernames[2] = "Cristian";
        passwords[2]= "12345";*/

        String[] usernames = {"Juancho", "admin", "Cristian"};
        String[] passwords = {"123","1234", "12345"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de usuario:");

        String usuario = sc.nextLine();

        System.out.println("Introduce la contraseña: ");
        String contr = sc.nextLine();

        boolean esAutenticado = false;

        for(int i = 0 ; i < usernames.length; i++){
            if(usernames[i].equals(usuario) && passwords[i].equals(contr)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido ".concat(usuario).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Error, requiere autentificación");
        }
    }
}
