/*
Hacer un programa para ingresar telcado una cant de horas y mostrar por
pantalla a cuentos dias y horas equivalen.
Ejemplp A: Si se ingresan 26 horas el programa mostrara por pantalla que
equivalen a 3 dias y 0 horas.
Ejemplo B: si se pingresan 72 horas el programa mostrara por pantalla que
equivale a 3 dias y 0 horas
Ejemplo C: si se ingresan 20 horas el programa mostrara por panatlla que
equivalen a 0 dias y 20 horas.
 */

package PR1;

import java.util.Scanner;

public class EjercicioDiez {

    int horas;

    public void time(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many hour do you have");
            horas = scanner.nextInt();


            int hour = horas / 24;
            int horasRestantes = (horas % 24);
            System.out.println("Son " + hour + " y los minutos restantes son " + horasRestantes);


    }
}
