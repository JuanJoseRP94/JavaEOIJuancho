
import javax.swing.*;

public class Arrays {
    public static void main(String[] args) {
        String[] nombres = {"Juancho", "Adri", "Cristian", "Carmen", "Antonio", "Ricardo"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("Juancho") ||
                    nombres[i].equalsIgnoreCase("Adri")){
                continue;
            }
            System.out.println(i + "- " + java.util.Arrays.toString(nombres));
        }

        String buscar = JOptionPane.showInputDialog("Introduce un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            JOptionPane.showMessageDialog(null, buscar + "No fue encontrado");
        }
    }
}