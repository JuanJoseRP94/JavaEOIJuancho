public class ExtensionArchivo {
    public static void main(String[] args) {
        String nombre = "mifoto.jpg";
        int tipoArchivo = nombre.lastIndexOf(".");
        String nombreArchivo = nombre.substring(0,tipoArchivo);
        System.out.println("El nombre del archivo es: " + nombreArchivo + "\nTipo de archivo: " + nombre.substring(tipoArchivo +1 ));
    }
}
