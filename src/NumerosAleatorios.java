public class NumerosAleatorios {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) ((int)50 + (Math.random() * 50));
            System.out.println(numeroAleatorio);
        }
    }
}
