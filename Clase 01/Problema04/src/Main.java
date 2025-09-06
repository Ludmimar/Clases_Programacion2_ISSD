import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Ingrese pago por hora: ");
        double pago = sc.nextDouble();

        double sueldo = horas * pago;
        System.out.println("Sueldo mensual: " + sueldo);

        sc.close();
    }
}