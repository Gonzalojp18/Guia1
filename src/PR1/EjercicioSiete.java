/*
Hacer un prog para ingresar por tecl el importe de una venta y el porcentaje
de desc aplicada a la misma y luego informar por pantalla importe a pagar:
Ejemplo A:
E el importe es 1200 y el desc es de 15% entonces el total a pagar sera de 1020
EjemploB:
Si el importe de la venta es $800 y el desc es el 0% entonces el total a
pagar sera de $800
 */

package PR1;

import java.util.Scanner;

public class EjercicioSiete {

    int price;
    double discount;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public EjercicioSiete() {}


    public void SellInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the price of the product");
        price = scanner.nextInt();

        System.out.println("enter the % off");
        discount = scanner.nextDouble();

        double discountEnd = (price * discount) / 100;
        double paidEnd = price - discountEnd;
                System.out.println("el total a pagar es de " + paidEnd);


    }
}
