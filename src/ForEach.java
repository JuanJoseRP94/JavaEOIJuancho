public class ForEach {
    public static void main(String[] args) {
        int[] enteros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: enteros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Juancho", "Adri", "Cristian", "Carmen", "Antonio", "Ricardo"};

        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}