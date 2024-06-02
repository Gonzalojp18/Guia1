package PR1;

import java.util.Scanner;

public class test {

    Scanner scanner = new Scanner(System.in);

    public void Determine(){
        System.out.println("enter a number ");
        int n = scanner.nextInt();

        for (int i = 0; n >= 10; i++){
            if(i <= 10){
                System.out.println("yo soy " + n + "y soy mejor a el numero 10");
            }else{
                System.out.println("Ya no soy menor que 10 ahora soy igual a 10");
            }
        }

    }
}
