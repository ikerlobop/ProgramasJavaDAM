package MediaAritmetica;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main (String[] args) {
        
        int nota1, nota2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();

        System.out.println("Nota 2 ");
        nota2 = sc.nextInt();

        //Calculamos la media
        media = (nota1 + nota2) / 2.0;

        System.out.println("La nota media es: " + media );


    }
}
