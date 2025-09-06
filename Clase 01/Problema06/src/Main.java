import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese precio del artículo: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        double total = precio * cantidad;
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}