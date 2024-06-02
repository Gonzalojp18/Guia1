/*
Hacer un programa para ingresar por teclado el importe de esa misma venta con
 el descuento aplicado y luego informar por pantalla el porcentaje del desc
 aplicada a la misma.
 Ejemplo A. Si el importe de la venta sin desuento es de 1500 y el importe de
  la venta con desc es de 1200. Entonces el porcentaje de desc aplicado fue
  del 20%
 */

package PR1;
import java.util.Scanner;
public class EjercicioOcho {


        /*EjercicioSiete ocho = new EjercicioSiete();
        ocho.SellInformation();*/

        int priceStart;
        int priceEnd;

        public void Reverse() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter the full price ");
            priceStart = scanner.nextInt();

            System.out.println("enter the price with discount");
            priceEnd = scanner.nextInt();

            double desc = ((priceStart - priceEnd) / priceStart) * 100;

            System.out.println("el % de desc " + desc);
        }

}
