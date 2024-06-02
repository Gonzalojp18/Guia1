package PR1;

import java.util.Scanner;

public class EjercicioCinco {
    /*
    Un comercio vende tres marcas de alfajores distintas A, B, C. Hacer un programa para que ingrese por teclado la cantidad de alf vendidos de cada uno de las tres marcas y luego informe el porcentaje de ventas para cada una de ella.
     */

    int marcaA = 0;
    int marcaB = 0;
    int marcaC = 0;

    public void SoldOut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuandos alfajores de la marca A vendiste");
        marcaA = scanner.nextInt();

        System.out.println("Cuandos alfajores de la marca B vendiste");
        marcaB = scanner.nextInt();

        System.out.println("Cuandos alfajores de la marca C vendiste");
        marcaC = scanner.nextInt();


        int totalDeAlfajoles = marcaA + marcaB + marcaC;

        double porcentajedeMarcaA = (marcaA * 100) / totalDeAlfajoles;

        double porcentajedeMarcaB = (marcaB * 100) / totalDeAlfajoles;

        double porcentajedeMarcaC = (marcaC * 100) / totalDeAlfajoles;

        System.out.println("el porcentaje de ventas de la marca A es " + porcentajedeMarcaA);
        System.out.println("el porcentaje de ventas de la marca B es " + porcentajedeMarcaB);
        System.out.println("el porcentaje de ventas de la marca C es " + porcentajedeMarcaC);







    }
}
