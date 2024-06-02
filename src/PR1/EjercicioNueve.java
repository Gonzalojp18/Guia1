/*
Hacer un programa para ingresar por teclado una cantidad de minutos y mostrar
 por pantalla a cuentas horas y minutos equivalen.
 Ejemplo A: Si se ingresan 380 minutos el programa mostrara por pantalla que
 equivalen  a 5 horas y 20 min
 Ejemplo B:  Si se ingresan 720 inutos el programa mostrara por pantalla que
 equivalen a 12 hras y 0 minut
 Ejemplo C; Si se ingresan 50 min el prog mostrar por pant que equivalen a 0
 horas y 50 min.
 */

package PR1;
import java.util.Scanner;
public class EjercicioNueve {
    int minutos;
    public void TellMeHours(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many minute do you have");
        minutos = scanner.nextInt();
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        System.out.println("Son " + horas + " y los minutos restantes son " + minutosRestantes );

    }

}
