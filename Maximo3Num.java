/**
 * Jaime Figueiredo
 * 17/11/2017
 */
package maximo.pkg3.num;
import java.util.Scanner;
public class Maximo3Num {
    public static void main(String[] args) {
        //Variáveis
        double n1,n2,n3;
        double max;
        Scanner numeros =new Scanner(System.in);
        // Codigo Principal
        System.out.print("Qual é o 1º numero ? ");
        n1=numeros.nextDouble();
        
        System.out.print("Qual é o 2º numero ? ");
        n2=numeros.nextDouble();
        
        System.out.print("Qual é o 3º numero ? ");
        n3=numeros.nextDouble();
        
        //Se
        if(n1>n2)
            if(n1>n3)
                max=n1;
            else
                max=n3;
        else if
            (n2>n3)
            max=n2;
                else 
                    max=n3;                  
        System.out.print("O numero maior é " + max);       
                        
    }
    
}
