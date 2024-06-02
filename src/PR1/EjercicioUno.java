package PR1;

import java.util.Scanner;

public class EjercicioUno {

    /*

   Hacer un programa para ingresar por teclado la cantidad de horas trabajadas por un operario y el valor que se le paga por hora trabajada y listar pantalla el sueldo que le corresponda
     */

    int horasTrabajadas = 0;
    float precioPorHora = 0;

    public void sueldoEmpleado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de horas trabajas");
        horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el precio de la hora de laburo");
        precioPorHora = scanner.nextFloat();

        double sueldoTotal = horasTrabajadas * precioPorHora;

        System.out.println("EL sueldo total a cobrar es de: " + sueldoTotal);
    }


}
