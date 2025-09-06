
public class Main {
    public static void main(String[] args) {
        int v1 = (int)(Math.random() * 11);
        int v2 = (int)(Math.random() * 11);
        int v3 = (int)(Math.random() * 11);

        System.out.println("Valores: " + v1 + ", " + v2 + ", " + v3);
        int menor = Math.min(v1, Math.min(v2, v3));
        System.out.println("El menor es: " + menor);
    }
}