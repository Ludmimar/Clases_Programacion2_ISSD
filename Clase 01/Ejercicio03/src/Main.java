
public class Main {
    public static void main(String[] args) {
        int valor1 = (int)(Math.random() * 10);
        int valor2 = (int)(Math.random() * 10);

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        if (valor1 == valor2) {
            System.out.println("Son iguales");
        } else if (valor1 > valor2) {
            System.out.println("El mayor es: " + valor1);
        } else {
            System.out.println("El mayor es: " + valor2);
        }
    }
}