package PR1;

import java.util.Scanner;

public class EjercicioTres {

    /*
    Una consecionia de autos paga a los vendedores un sueldo fijo de 5000 mas 700 de premio por cada auto vendido. hacer un programa que permita ingresar por teclado la cantidad de autos vendidos por un vendedor y luego informar por pantalla el sueldo total
     */

    int sueldo = 5000;
    int premio = 700;
    int autosVendidos = 0;

    public void Comisiones() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos coches vendiste");
        autosVendidos = scanner.nextInt();

        int comision = premio * autosVendidos;
        int sueldoTotal = sueldo + comision;

        System.out.println("EL sueldo total a cobrar es de: " + sueldoTotal);



    }
}
