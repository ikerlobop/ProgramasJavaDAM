import java.util.Scanner;

public class PedirNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");

        String nombre = sc.next();

        System.out.println("Tú nombre es: "+ nombre);

    }
}