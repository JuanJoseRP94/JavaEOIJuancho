public class EjemplosWhile {
    public static void main(String[] args) {
        // Recorrer los 20 primeros números
        // While
        int contador = 0;
        while (contador<=20){
            System.out.println("contador = " + contador);
            contador++;
        }
        // recorrer una matriz
        String [] coches = {"Renault", "Seat","Ford", "Subaru"};
        int indice = 0;
        while (indice < coches.length){
            System.out.println("coches = " + coches[indice]);
            indice++;
        }
    }
}
