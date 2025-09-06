import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese valor 1: ");
        int v1 = sc.nextInt();
        System.out.print("Ingrese valor 2: ");
        int v2 = sc.nextInt();
        System.out.print("Ingrese valor 3: ");
        int v3 = sc.nextInt();

        double promedio = (v1 + v2 + v3) / 3.0;
        System.out.println("Promedio = " + promedio);

        if (promedio >= 5) {
            System.out.println("El promedio es mayor o igual a 5");
        } else {
            System.out.println("El promedio es menor a 5");
        }

        sc.close();
    }
}