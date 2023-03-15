import java.util.Random;

public class ClaveAleatoria {
    public static void main(String[] args) {
        // Genera una clave alfanumérica de n digitos
        // Que contenga Mayúsculas, Minúsculas, Números
        // y caracteres especiales "@#&..."

        String clave = generaClave(12);

        System.out.println(clave);
    }

    private static String generaClave(int n) {
        String pass = "";
        String[][] origen = {{"A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
                {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
                {"0","1","2","3","4","5","6","7","8","9"},
                {"!","#","@","~","$","%"}};
        Random objetoRandom = new Random();

        // Definimos cada uno de los apartados en False para comprobar 1 a 1.
        boolean contieneMayuscula = false;
        boolean contieneMinuscula = false;
        boolean contieneNumero = false;
        boolean contieneCaracterEspecial = false;

        // Recorremos el Array para comprobar.
        for (int i = 0; i < n; i++) {
            int zona = objetoRandom.nextInt(4);
            pass += origen[zona][objetoRandom.nextInt(origen[zona].length)];
            if (zona == 0 && !contieneMayuscula) {
                contieneMayuscula = true;
            } else if (zona == 1 && !contieneMinuscula) {
                contieneMinuscula = true;
            } else if (zona == 2 && !contieneNumero) {
                contieneNumero = true;
            } else if (zona == 3 && !contieneCaracterEspecial) {
                contieneCaracterEspecial = true;
            }
        }

        // Si no coinciden todas las opciones volvemos a generar la contraseña
        if (!contieneMayuscula || !contieneMinuscula || !contieneNumero || !contieneCaracterEspecial) {
            System.out.println("La contraseña no cumple los requisitos, vamos a generar otra:");
            return generaClave(n);
        }
        return pass;
    }
}
