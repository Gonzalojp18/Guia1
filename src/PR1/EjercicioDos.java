package PR1;

import java.util.Scanner;

public class EjercicioDos {
    /*
    Hacer un programa que solicite por teclado que se ingresen dos nmeros y luego guardarlos en dos var distintas. A continuacion se deben intercambiar mutuamenre los calores en ambas variables y mostrarlos por pantalla
    ejemplo
    si se ingresa 3 y 8 guardadas en A y B la salida tendria que ser A siendo y b siendo 3.
     */

    int numberOne = 0;
    int numberTwo = 0;

    public void ExchangeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the fisrt number ");
        numberOne = scanner.nextInt();

        System.out.println("enter the second number");
        numberTwo = scanner.nextInt();

        int permanente = numberOne;

        numberOne = numberTwo;
        numberTwo = permanente;


        System.out.println("invertimos los numeros " + numberOne  +  numberTwo );


    }

}
