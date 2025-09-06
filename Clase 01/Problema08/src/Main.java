import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es nulo");
        }

        sc.close();
    }
}