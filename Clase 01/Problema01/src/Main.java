
public class Main {
    public static void main(String[] args) {
        int numero = (int)(Math.random() * 1001);
        System.out.println("Número generado: " + numero);
        System.out.println("Cantidad de dígitos: " + String.valueOf(numero).length());
    }
}