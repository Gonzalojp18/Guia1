/*
Hace run prog para que un comercio ingrese por teclado
a recaudacion en pesos para cada semana una de las cuatro semanas del mes.
E>l prog debe listar la recaudacion promedio por semana y el porc de
recaudacion por semana.
Ejemplo. Se se ingresa 1600, 1200, 4800, 400 s elistara como recaudacion
promedio 2000 y como porcentajes por semana
20
15
60
5
 */

package PR1;

import java.util.Scanner;

public class EjercicioSeis {

    int semana1, semana2, semana3, semana4 = 0;

    public void SellReport(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sell of the first week");
        semana1 = scanner.nextInt();

        System.out.println("enter sell of the first week");
        semana2 = scanner.nextInt();

        System.out.println("enter sell of the first week");
        semana3 = scanner.nextInt();

        System.out.println("enter sell of the first week");
        semana4 = scanner.nextInt();

        int soldOut = semana1+semana2+semana3+semana4;
        int promedio = soldOut/4;

        double percenByWeed1 = (semana1 * 100) / soldOut;
        double percenByWeed2 = (semana2 * 100) / soldOut;
        double percenByWeed3 = (semana3 * 100) / soldOut;
        double percenByWeed4 = (semana4 * 100) / soldOut;

        System.out.println("el promerio de la semana 1 es " + percenByWeed1);
        System.out.println("el promerio de la semana 1 es " + percenByWeed2);
        System.out.println("el promerio de la semana 1 es " + percenByWeed3);
        System.out.println("el promerio de la semana 1 es " + percenByWeed4);

        System.out.println("Y el promedio de recaudacion es de " + promedio);
    }







}
