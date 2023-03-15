import java.util.Arrays;

public class ClaseArrays {
    public static void main(String[] args) {
        String[] colores = {"rojo", "azul", "verde", "púrpura", "amarillo"};
        int [] numeros = {9,8,3,6,7,2,1,5,4};
        int [] numeros1 = {1,2,3,4,5,2,7};
        int [] numeros2 = {1,2,3,4,5,2,7};

        // Buscar ->> ¡¡Solo en matrices ordenadas y sin elementos repetidos
        System.out.println("Arrays.binarySearch(numeros1, 2) = " + Arrays.binarySearch(numeros1,2));
        System.out.println("-----------------");

        // ordenar matriz
        Arrays.sort(numeros);
        for (int a:numeros) {
            System.out.println("a = " + a);
        }
        System.out.println("-----------");
        Arrays.sort(colores);
        for (String b:colores) {
            System.out.println("b = " + b);
        }
        System.out.println("-----------");

        // Comparar 2 arrays
        System.out.println("Arrays.equals(numeros, numeros1) = " + Arrays.equals(numeros, numeros1));
        System.out.println("Arrays.compare(numeros, numeros1) = " + Arrays.compare(numeros, numeros1));
        System.out.println("Arrays.equals(numeros1, numeros2) = " + Arrays.equals(numeros1, numeros2));
        System.out.println("Arrays.compare(numeros1, numeros2) = " + Arrays.compare(numeros1, numeros2));
        System.out.println("--------------------");
        
        // Copiar
        int [] copia = Arrays.copyOf(numeros1, numeros.length);
        for (int a: copia){
            System.out.println("a = " + a);
        }
        System.out.println("-------------------");
        // copiar rango
        int[] copiaRango = Arrays.copyOfRange(numeros1,2,6); // límite superior no incluido
        for (int a: copiaRango){
            System.out.println("a = " + a);
        }
        System.out.println("-------------");
        // Rellenar
        Arrays.fill(numeros2,23);
        for (int a:numeros2){
            System.out.println("a = " + a);
        }
        System.out.println("-----------");
        String[] nombres = new String[9];
        Arrays.fill(nombres, "Disponible");
        for (String a:nombres) {
            System.out.println("a = " + a);
        }
    }
}
