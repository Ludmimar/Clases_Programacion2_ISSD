
public class Main {
    public static void main(String[] args) {
        int valor = 1 + (int)(Math.random() * 10);
        System.out.println("Valor: " + valor);

        switch (valor) {
            case 5: System.out.println("Ganó un auto"); break;
            case 7: System.out.println("Ganó una heladera"); break;
            case 9: System.out.println("Ganó un televisor"); break;
            default: System.out.println("No ganó nada");
        }
    }
}