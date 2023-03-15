
public class ReemplazarOtro {
    public static void main(String[] args) {
        String nombre = "Juancho";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Juancho\") = " + nombre.equals("Juancho"));
        System.out.println("nombre.equals(\"juancho\") = " + nombre.equals("juancho"));
        System.out.println("nombre.equalsIgnoreCase(\"juancho\") = " + nombre.equalsIgnoreCase("juancho"));
        System.out.println("nombre.compareTo(\"Juancho\") = " + nombre.compareTo("Juancho"));
        System.out.println("nombre.compareTo(\"Adri\") = " + nombre.compareTo("Adri"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(1, 6) = " + nombre.substring(1, 6));

        String trabalengua = "Trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", "."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalengua.contains(\"T\") = " + trabalengua.contains("T"));
        System.out.println("trabalengua.startsWith(\"Traba\") = " + trabalengua.startsWith("Traba"));
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("  Trabalenguas ");
        System.out.println("  Trabalenguas ".trim());
    }
}
