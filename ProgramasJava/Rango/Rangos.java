package Rango;

public class Rangos {

    public static void main(String[] args) {
        short num;
        num =  32767;

        System.out.println("Valor máximo para short: " + num);
        num++; // si incrementamos el valor nos vamos a desbordar en el rango entonces tomará el valor mínimo de short

        System.out.println("Valor mínimo para short: " + num);


    }
    
}
