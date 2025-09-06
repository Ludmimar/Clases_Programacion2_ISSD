import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese primer valor: ");
        int v1 = teclado.nextInt();
        System.out.print("Ingrese segundo valor: ");
        int v2 = teclado.nextInt();

        int suma = v1 + v2;
        System.out.println("La suma es: " + suma);

        teclado.close();
    }
}