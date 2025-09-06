import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese lado del cuadrado: ");
        double lado = sc.nextDouble();

        double perimetro = lado * 4;
        System.out.println("Perímetro = " + perimetro);

        sc.close();
    }
}