package AdivinarEdad;

import java.util.Scanner;

public class AdivinarEdad {

    public static void main(String[] args){
        int aNacimiento;
        int aActual;
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu año de nacimiento: ");
        aNacimiento = sc.nextInt();

        System.out.println("Introduce el año actual: ");
        aActual = sc.nextInt();

        edad = aActual - aNacimiento;

        System.out.println("Tú edad es: " + edad);
    }
    
}
