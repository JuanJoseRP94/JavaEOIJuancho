import java.util.Scanner;

public class TernarioMayor {
    public static void main(String[] args) {
        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num1 = sc.nextInt();
        System.out.println("Introduce un segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Introduce un tercer número:");
        int num3 = sc.nextInt();
        System.out.println("Introduce un cuarto número:");
        int num4 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El número mayor es = " + max);

    }
}