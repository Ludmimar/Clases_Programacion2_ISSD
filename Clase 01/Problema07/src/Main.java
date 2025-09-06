import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3.0;
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }

        sc.close();
    }
}