public class AbecedarioAscii {
    public static void main(String[] args) {
        // Orden normal
        char[] abecedario = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
        for (int i = 0; i < abecedario.length; i++){
            System.out.print(abecedario[i] + " - ");
        }
        System.out.println(" ");
        // Orden inverso
        for (int i = abecedario.length -1; i >= 0; i--){
            System.out.print(abecedario[i] + " - ");
        }
    }
}