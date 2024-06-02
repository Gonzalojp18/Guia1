/*
Hacer un prog para ingresar por teclado una cant de minutos y mostrar por
pantalla a cuentos dias, horas y minutos equivalen.
Ejemplo A: si se ingresan 1520 minutos el programa mostrara por panatalla que
 Equivalen A 1 dia, 1 hora y 20 minutos.
 Ejemplo B: si se ingresan 480 minutos  el programa mostrara por pantalla que
  equivalen a 0 dia, 8 horas y 0 minutos.
 */

package PR1;

import java.util.Scanner;

public class EjercicioOnce {

    int minutos;

    public void dayInformation(){
        Scanner scanner = new Scanner(System.in);
        minutos = scanner.nextInt();

        int hour  = minutos / 60;
        int days = hour / 24;
        int minute = minutos % 60;
        int horasRestantes = hour % 24;

        System.out.println("hay " + days + " y las horas son " + hour + " y " +
                "los minutos " + minute );
    }

}
