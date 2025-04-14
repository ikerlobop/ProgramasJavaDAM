import java.util.Scanner;

public class PedirEdadMasUno {

    public static void main (String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tú edad: ");
        edad = sc.nextInt();

        edad = edad + 1;

        System.out.println("El año que viene tendras " + edad + " años");

    }
}
