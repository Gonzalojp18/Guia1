package PR1;

import java.util.Scanner;

public class EjercicioCuatro {

    /*
    Hacer un programa para ingresar por teclado la cantidad de asientos en una avion t la cantidad de pasajes ocupados. Luego calcular e informar el porcentaje de ocupacion y el porcentaje de no ocupacion
    100 = total
    30 = vendidos
    = 70 disponibles
     */

    int asientosTotales = 0;
    int pasajesVendidos = 0;


     public void AirTraver(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("ingrese la cantidad de asientos totales disponibles");
         asientosTotales = scanner.nextInt();

         System.out.println("Ingrese cuantos pasajes fueron vendisos");
         pasajesVendidos = scanner.nextInt();

         int asientosDisponibles = asientosTotales - pasajesVendidos;

         double porcentajeVendidos = (pasajesVendidos * 100)  / asientosTotales;

         double porcentajeDisponibles = (double)asientosDisponibles * 100 / asientosTotales;

         System.out.println("el porcentaje de pasajes vendidos es de " + porcentajeVendidos + " y tienes un porcentaje disponible de " + porcentajeDisponibles);


     }


}
