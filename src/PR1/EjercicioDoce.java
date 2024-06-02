/*
2 Una granja vende la caja de 12 unidades a $1000 y cada huevo suelto a $120.
Hacer un programa para ingresar la cantidad de huevos que compra un cliente y
mostrar por pantalla el importe total a pagar.
Recordatorio. Por cada 12 huevos se debe calcular una caja y el excedente se
calcula como suelto.
Ejemplo A. Si la cantidad ingresada son 15 huevos, el programa calculará 1 caja
y 3 sueltos, es decir $1000 + $120 x 3 = $1360.
 */
package PR1;

import java.util.Scanner;

public class EjercicioDoce {
    int docena = 12;
    int precio = 1000;
    int cantidadCompra;
    public void egg(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the how much egg do you want");
        cantidadCompra = scanner.nextInt();

        int numCajas = cantidadCompra / docena;
        int unidadesSueltas = cantidadCompra % docena;

        System.out.println("compraste las cantidad de " + numCajas + "cajas" + "unidades sueltas son" + unidadesSueltas);



    }
}
