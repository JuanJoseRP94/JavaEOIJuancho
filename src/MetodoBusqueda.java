public class MetodoBusqueda {
    public static void main(String[] args) {

        int[] nums = {2,4,5,6,2,4,6,1};
        String[] nombres = {"Juancho", "Diego", "Alejandro", "Santiago", "Alba"};
        System.out.println("buscaMatriz(nums, 3,0) = " + buscaMatriz(nums, 6,0));
        System.out.println("buscaMatriz(\"Diego\", \"Diego\", 0) = " + buscaMatriz(nombres, "Diego", 0));
    }
    public static int buscaMatriz(int[] numeros, int busca, int desde){
        //Devuelve el primer índice en el que aparece "busca" desde el índice "Desde"
        // Si no lo encuentra devolver -1

        for (int i = desde; i < numeros.length; i++){
            if (numeros[i] == busca){
                return i;
            }
        }
        return -1;
    }

    public static int buscaMatriz(String[] textos, String busca, int desde){
        for (int i = desde; i < textos.length; i++){
            if (busca.equals(textos[i])){
                return i;
            }
        }
        return -1;
    }
}
