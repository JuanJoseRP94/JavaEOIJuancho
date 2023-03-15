import java.util.Properties;

public class VariablesSistema {
    public static void main(String[] args) {
        // Variables del sistema de 1 en 1
        // Implica que hay que saber qué variables queremos leer
        System.out.println("Usuario = " + System.getProperty("user.name"));
        System.out.println("Directorio = " + System.getProperty("user.dir"));
        System.out.println("Versión de Java: " + System.getProperty("java.version"));

        // Leer todas las variables del sistema
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}